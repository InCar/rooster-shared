package com.incarcloud.rooster.gather.cmd.device;/**
 * Created by fanbeibei on 2017/7/19.
 */

import org.I0Itec.zkclient.ZkClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Fan Beibei
 * @Description: zookeeper实现的注册器
 * @date 2017/7/19 11:43
 */
public class ZookeeperDeviceConnectionRegister implements DeviceConnectionRemoteRegister {
    private static Logger s_logger = LoggerFactory.getLogger(ZookeeperDeviceConnectionRegister.class);

    /**
     * 根路径
     */
    private static  final  String ROOT_PATH = "/rooster-gather";

    private ZkClient zk;


    public ZookeeperDeviceConnectionRegister(String zkSever){

        zk = new ZkClient(zkSever,2000);
        init();
    }

    protected void init(){
        if(!zk.exists(ROOT_PATH)){
            zk.createPersistent(ROOT_PATH);
        }
    }

    @Override
    public void registerConnection(String vin, String cmdServerUrl){
        String nodePath =  ROOT_PATH+"/"+vin;

        if(!zk.exists(nodePath)){
//            zk.createPersistent(nodePath,true);
            zk.createEphemeral(nodePath);
        }

        zk.writeData(nodePath,cmdServerUrl);
    }

    @Override
    public void removeConnection(String vin) {
        String nodePath =  ROOT_PATH+"/"+vin;

        if(zk.exists(nodePath)){
            zk.deleteRecursive(nodePath);
        }
    }
}
