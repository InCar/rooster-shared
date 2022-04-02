package com.incarcloud.rooster.gather.cmd;


import com.incarcloud.rooster.util.PackageUtils;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 命令工厂管理类
 *
 * @author Fan Beibei
 * @version 1.0
 */
public class CommandFactoryManager {

    /**
     * datapack package
     */
    public static final String BASE_DATAPACK_PACKAGE = "com.incarcloud.datapack";

    /**
     * protocol -> CommandFactory
     */
    private static ConcurrentHashMap<String, Class<? extends CommandFactory>> commandFactoryClazzMap = new ConcurrentHashMap<>();

    /**
     * 缓存工厂对象
     */
    private static ConcurrentHashMap<String, CommandFactory> commandFactoryCache = new ConcurrentHashMap<>();

    /**
     * 注册命令工厂类
     *
     * @param protocol
     * @param clazz
     */
    public static void registerCommandFactory(String protocol, Class<? extends CommandFactory> clazz) {
        commandFactoryClazzMap.put(protocol, clazz);
    }

    /**
     * 获取工厂对象
     *
     * @param protocol
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static CommandFactory getCommandFactory(String protocol) throws InstantiationException, IllegalAccessException {
        CommandFactory factory = commandFactoryCache.get(protocol);

        if (null != factory) {
            return factory;
        }

        Class<? extends CommandFactory> clazz = commandFactoryClazzMap.get(protocol);
        if (null == clazz) {
            return null;
        }
        factory = clazz.newInstance();
        commandFactoryCache.put(protocol, factory);

        return factory;
    }

    public static void loadCommandFactoryClass() {
        try {
            PackageUtils.loadClassesOfPackage(BASE_DATAPACK_PACKAGE, true);
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }
}
