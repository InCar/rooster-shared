package com.incarcloud.rooster.gather.cmd;/**
 * Created by fanbeibei on 2017/7/21.
 */

import com.incarcloud.rooster.util.PackageUtils;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Fan Beibei
 * @Description: 命令工厂管理类
 * @date 2017/7/21 16:26
 */
public class CommandFacotryManager {
    /**
     * protocol -> CommandFacotry
     */
    private static ConcurrentHashMap<String, Class<? extends CommandFactory>> commandFacotryClazzMap = new ConcurrentHashMap<>();

    /**
     * 缓存工厂对象
     */
    private static ConcurrentHashMap<String, CommandFactory> commandFacotryCache = new ConcurrentHashMap<>();

    /**
     * 注册命令工厂类
     *
     * @param protocol
     * @param clazz
     */
    public static void registerCommandFacotry(String protocol, Class<? extends CommandFactory> clazz) {
        commandFacotryClazzMap.put(protocol, clazz);
    }


    /**
     * 获取工厂对象
     *
     * @param protocol
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static CommandFactory getCommandFacotry(String protocol) throws InstantiationException, IllegalAccessException {
        CommandFactory facotry = commandFacotryCache.get(protocol);

        if (null != facotry) {
            return facotry;
        }


        Class<? extends CommandFactory> clazz = commandFacotryClazzMap.get(protocol);
        if(null == clazz){
            return null;
        }
        facotry = clazz.newInstance();
        commandFacotryCache.put(protocol, facotry);

        return facotry;
    }

    public static void loadCommandFacotryClass(){
        try {
            PackageUtils.loadClassesOfPackage("com.incarcloud.rooster.datapack", true);
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

}
