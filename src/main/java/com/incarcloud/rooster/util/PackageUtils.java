package com.incarcloud.rooster.util;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * 扫描Java包下类的工具类,包括引入的jar(必须是打包时Add directory entries)包中的
 *
 * @author fanbeibei
 * @version 1.0
 */
public final class PackageUtils {

    /**
     * 私有构造函数
     */
    private PackageUtils() {
    }

    /**
     * 加载包下所有类,包括引入的jar(必须是打包时Add directory entries)包中的
     *
     * @param packageName 包名
     * @param recursive   是否递归子包
     * @throws IOException 包路径不存在
     */
    public static void loadClassesOfPackage(String packageName, boolean recursive) throws IOException {
        List<String> clazzNames = getClassesNamesOfPackage(packageName, true);

        for (String cn : clazzNames) {
            try {
                Class.forName(cn);
            } catch (ClassNotFoundException e) {
                // 能获取类名，肯定这个类存在，这里不会发生
            } catch (NoClassDefFoundError e) {
                // 这里抛异常是因为该类依赖某个其他包的类，而其他包有没有引入
            }
        }
    }

    /**
     * 获取包下所有类的类名,包括引入的jar(必须是打包时Add directory entries)包中的
     *
     * @param packageName 包名
     * @param recursive   是否递归子包
     * @return
     * @throws IOException 包路径不存在
     */
    public static List<String> getClassesNamesOfPackage(String packageName, boolean recursive) throws IOException {

        if (null == packageName || "".equals(packageName.trim())) {
            throw new IllegalArgumentException();
        }

        List<String> clazzNames = new LinkedList<String>();

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        String packagePath = packageName.replace(".", "/");
        // 获取含有该路径的资源URL
        Enumeration<URL> urls = loader.getResources(packagePath);
        while (urls.hasMoreElements()) {
            URL url = (URL) urls.nextElement();
            String type = url.getProtocol();
            if (type.equals("file")) {
                clazzNames.addAll(getClassNamesByFile(packageName, url.getPath(), recursive));
            } else if (type.equals("jar")) {
                JarFile jar = ((JarURLConnection) url.openConnection()).getJarFile();
                clazzNames.addAll(getClassNamesByJar(packageName, jar, recursive));
            }

        }
        return clazzNames;
    }

    /**
     * @param packageName    包名
     * @param packageDirPath 包路径
     * @param recursive      是否递归子包
     */
    private static List<String> getClassNamesByFile(String packageName, String packageDirPath, boolean recursive) {
        List<String> clazzNames = new LinkedList<String>();

        File packageDir = new File(packageDirPath);
        File[] files = packageDir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                // 是包的路径
                if (recursive) {
                    clazzNames.addAll(getClassNamesByFile(packageName, f.getPath(), recursive));
                }
            } else {
                // 是类的路径
                if (f.getPath().endsWith(".class")) {
                    String fileName = f.getName();
                    clazzNames.add(packageName + "." + fileName.substring(0, fileName.length() - 6));
                }
            }
        }

        return clazzNames;
    }

    /**
     * @param packageName 包名
     * @param jar         jar文件
     * @param recursive   是否递归子包
     */
    private static List<String> getClassNamesByJar(String packageName, JarFile jar, boolean recursive) {
        List<String> clazzNames = new LinkedList<String>();

        Enumeration<JarEntry> entries = jar.entries();
        // 包路径前缀
        String packagePathPrefix = packageName.replace(".", "/") + "/";

        while (entries.hasMoreElements()) {
            // 获取jar里的一个实体，可以是目录或jar包里的其他文件 如META-INF等文件
            JarEntry entry = entries.nextElement();
            String name = entry.getName();
            /**
             * name结果如下所示
             *
             * com/mysql/jdbc/Wrapper.class com/mysql/jdbc/WriterWatcher.class
             * com/mysql/jdbc/authentication/
             * com/mysql/jdbc/authentication/MysqlClearPasswordPlugin.class
             * com/mysql/jdbc/authentication/MysqlNativePasswordPlugin.class
             * com/mysql/jdbc/authentication/MysqlOldPasswordPlugin.class
             * com/mysql/jdbc/authentication/Sha256PasswordPlugin.class
             * com/mysql/jdbc/configs/
             * com/mysql/jdbc/configs/3-0-Compat.properties
             * com/mysql/jdbc/configs/5-0-Compat.properties
             * com/mysql/jdbc/configs/clusterBase.properties
             * com/mysql/jdbc/configs/coldFusion.properties
             */
            // 如果是以/开头的
            if (name.charAt(0) == '/') {
                // 获取后面的字符串
                name = name.substring(1);
            }

            if (name.startsWith(packagePathPrefix) && name.endsWith(".class")) {
                if (recursive) {
                    // 如果需要加载子包，则不作判断
                    String clazzName = name.substring(0, name.length() - 6).replace("/", ".");
                    clazzNames.add(clazzName);
                } else {
                    // 不需要加载子包
                    // 根据路径判断是否子包的类
                    if (packagePathPrefix.equals(name.substring(0, name.lastIndexOf("/") + 1))) {
                        String clazzName = name.substring(0, name.length() - 6).replace("/", ".");
                        clazzNames.add(clazzName);
                    }
                }
            }
        }

        return clazzNames;
    }
}
