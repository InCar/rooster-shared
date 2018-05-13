package com.incarcloud.rooster.datapack;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * DataDispatchTest
 *
 * @author Aaric, created on 2017-06-27T14:23.
 * @since 2.0
 */
public class DataDispatchTest {

    @Test
    @Ignore
    public void testExtract() throws Exception {
        IDataParser dataParser = (IDataParser) DataParserManager.getDataParserClass("incar-any4-1.0.0").newInstance();
        DataDispatch dataDispatch = new DataDispatch(null, dataParser);
        List<DataPackTarget> dataPackTargetList = dataDispatch.extractBody();
        if (null != dataPackTargetList && 0 < dataPackTargetList.size()) {
            DataPackObject dataPackObject;
            for (DataPackTarget dataPackTarget : dataPackTargetList) {
                if (null != dataPackTarget && null != dataPackTarget.getDataPackObject()) {
                    dataPackObject = dataPackTarget.getDataPackObject();
                    if (dataPackObject instanceof DataPackOverview) {
                        // 分发整车数据
                    } else if (dataPackObject instanceof DataPackBattery) {
                        // 分发电池数据
                    } else if (dataPackObject instanceof DataPackMotor) {
                        // 分发驱动电机数据
                    } else if (dataPackObject instanceof DataPackEngine) {
                        // 分发发动机数据
                    } else if (dataPackObject instanceof DataPackPosition) {
                        // 分发位置数据
                        DataPackPosition position = (DataPackPosition) dataPackTarget.getDataPackObject();
                        System.out.println(position.getLongitude() + ":" + position.getLatitude());
                    } else if (dataPackObject instanceof DataPackPeak) {
                        // 分发极值数据
                    } else if (dataPackObject instanceof DataPackAlarm) {
                        // 分发报警数据
                    } else if (dataPackObject instanceof DataPackDevice) {
                        // 分发上报设备信息
                    }
                }
            }
        }
    }
}
