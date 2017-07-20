package com.incarcloud.rooster.gather.cmd.client;/**
 * Created by fanbeibei on 2017/7/19.
 */

import com.incarcloud.rooster.gather.cmd.CommandType;
import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Fan Beibei
 * @Description: 描述
 * @date 2017/7/19 17:02
 */
public class RestfulCommandClient extends  AbstractCommandClient {
    private static Logger s_logger = LoggerFactory.getLogger(RestfulCommandClient.class);


    /**
     * 根路径
     */
    private static  final  String ROOT_PATH = "/rooster-gather";

    private ZkClient zk;
    /**
     * vin -> url
     */
    private ConcurrentHashMap<String,String> vinUrlMap = new ConcurrentHashMap<>();




    public RestfulCommandClient(String zkzServer){
        zk = new ZkClient(zkzServer);
        init();
    }

    private void init(){
        loadVinUrlMap();

        //订阅节点变化更新本地缓存
        zk.subscribeChildChanges(ROOT_PATH, childListener);
        List<String> childrenPath = zk.getChildren(ROOT_PATH);
        if(null != childrenPath || childrenPath.size() > 0){
            for(String cp:childrenPath){
                zk.subscribeDataChanges(ROOT_PATH+"/"+cp,dataListener);
            }
        }

    }


    private void loadVinUrlMap(){
        List<String>  vinPath = zk.getChildren(ROOT_PATH);
        for (String path:vinPath){
            String data = zk.readData(path);
            vinUrlMap.put(path,data.split(",")[1]);
        }
    }


    /**
     * 根据vin码获取服务端地址
     *
     * @param vin 车辆vin码
     * @return
     */
    @Override
    protected String getServerUrl(String vin){
        String url = vinUrlMap.get(vin);
        if(null != url){
            return url;
        }

        /*String path = ROOT_PATH+"/"+vin;
        if(zk.exists(path)){
            url = zk.readData(path);
            return url;
        }*/

        return null;
    }

    /**
     * @param url     服务端地址
     * @param vin     车辆vin码
     * @param command 指令类型
     * @throws Exception
     */
    @Override
    public void sendCommand(String url, String vin, CommandType command) throws Exception{

    }





    private IZkChildListener childListener = new IZkChildListener() {
        @Override
        public void handleChildChange(String parentPath, List<String> currentChilds) throws Exception {
            if(null == currentChilds){
                s_logger.error("root node delete");
                return ;
            }

            //重新注册事件
            for (String  c : currentChilds) {
                zk.subscribeDataChanges(parentPath+"/"+c, dataListener);
            }

        }
    };

    private IZkDataListener dataListener = new IZkDataListener() {
        @Override
        public void handleDataChange(String dataPath, Object data) throws Exception {
            s_logger.debug("handleDataChange  "+dataPath+"->"+data);

            //更新数据
            String url  = (String)data;
            vinUrlMap.put(dataPath,url);

        }

        @Override
        public void handleDataDeleted(String dataPath) throws Exception {
            s_logger.debug("handleDataDeleted  "+dataPath);
            vinUrlMap.remove(dataPath);
        }
    };

}
