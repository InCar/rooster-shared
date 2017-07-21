package com.incarcloud.rooster.datapack;/**
 * Created by fanbeibei on 2017/7/21.
 */

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
    private static ConcurrentHashMap<String, Class<CommandFacotry>> commandFacotryClazzMap = new ConcurrentHashMap<>();

    /**
     * 缓存工厂对象
     */
    private static ConcurrentHashMap<String, CommandFacotry> commandFacotryCache = new ConcurrentHashMap<>();

    /**
     * 注册命令工厂类
     *
     * @param protocol
     * @param clazz
     */
    public static void registerCommandFacotry(String protocol, Class<CommandFacotry> clazz) {
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
    public static CommandFacotry getCommandFacotry(String protocol) throws InstantiationException, IllegalAccessException {
        CommandFacotry facotry = commandFacotryCache.get(protocol);

        if (null != facotry) {
            return facotry;
        }


        Class<CommandFacotry> clazz = commandFacotryClazzMap.get(protocol);
        facotry = clazz.newInstance();
        commandFacotryCache.put(protocol, facotry);

        return facotry;
    }


}
