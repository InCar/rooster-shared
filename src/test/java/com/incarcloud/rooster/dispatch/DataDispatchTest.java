package com.incarcloud.rooster.dispatch;

import com.incarcloud.rooster.datapack.IDataParser;
import com.incarcloud.rooster.datatarget.DataTargetPosition;
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
        DataDispatch dataDispatch = new DataDispatch(null, (IDataParser) Class.forName("com.incarcloud.rooster.datapack.DataParserLandu").newInstance());
        List<DataPackTarget> dataPackTargetList = dataDispatch.extractBody();
        if(null != dataPackTargetList && 0 < dataPackTargetList.size()) {
            for (DataPackTarget dataPackTarget: dataPackTargetList) {
                switch (dataPackTarget.getTargetType()) {
                    case OVERVIEW:
                        // 分发整车数据
                        break;
                    case BATTERY:
                        // 分发电池数据
                        break;
                    case ELECTRIC:
                        // 分发驱动电机数据
                        break;
                    case ENGINE:
                        // 分发发动机数据
                        break;
                    case POSITION:
                        // 分发位置数据
                        DataTargetPosition position = (DataTargetPosition) dataPackTarget.getDataTarget();
                        System.out.println(position.getLongitude() + ":" + position.getLatitude());
                        break;
                    case PEAK:
                        // 分发极值数据
                        break;
                    case ALARM:
                        // 分发报警数据
                        break;
                    case DEVICE:
                        // 分发上报设备数据
                        break;
                }
            }
        }
    }
}
