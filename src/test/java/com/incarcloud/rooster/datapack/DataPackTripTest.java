package com.incarcloud.rooster.datapack;

import com.incarcloud.rooster.util.DataPackObjectUtil;
import com.incarcloud.rooster.util.RowKeyUtil;
import org.junit.Test;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;

/**
 * DataPackTripTest
 *
 * @author Aaric, created on 2018-07-09T16:33.
 * @since 2.2.3-SNAPSHOT
 */
public class DataPackTripTest {

    @Test
    public void testGenJson() throws Exception {
        // deviceId: 911111199001888
        // vin: LSBAAAAAAZZ001888
        DataPack dataPack = new DataPack("china", "gmmc", "1.16");
        DataPackObject dataPackObject = new DataPackObject(dataPack);
        dataPackObject.setDeviceId("911111199001888");
        dataPackObject.setVin("LSBAAAAAAZZ001888");

        // scan 'telemetry', {FILTER=>org.apache.hadoop.hbase.filter.PrefixFilter.new(org.apache.hadoop.hbase.util.Bytes.toBytes('98ac000LSBAAAAAAZZ001888TRIP'))}
        DataPackTrip dataPackTrip;
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat dateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss");
        for (int i = 0; i < 10; i++) {
            dataPackTrip = new DataPackTrip(dataPackObject);
            dataPackTrip.setDetectionTime(dateFormat1.parse(MessageFormat.format("2018-06-1{0} 12:00:00", i)));
            dataPackTrip.setStartTime(dateFormat1.parse(MessageFormat.format("2018-06-1{0} 10:00:00", i)));
            dataPackTrip.setEndTime(dateFormat1.parse(MessageFormat.format("2018-06-1{0} 12:00:00", i)));
            dataPackTrip.setOilWearAvg(0.12F);
            dataPackTrip.setSpeedAvg(75F);
            dataPackTrip.setSpeedMax(115F);
            dataPackTrip.setTripDuration(2 * 60);
            dataPackTrip.setMileage(120000);
            dataPackTrip.setRapidAccelerationTimes(3);
            dataPackTrip.setRapidDecelerationTimes(4);
            dataPackTrip.setSharpTurnTimes(5);

            // 行程开始位置
            DataPackPosition position = new DataPackPosition(dataPackObject);
            position.setPositioMode(DataPackPosition.POSITION_MODE_BEIDOU);
            position.setPositioModeDesc("北斗定位");
            position.setLongitude(114.406728);
            position.setLatitude(30.477141);
            position.setAltitude(43D);
            position.setSpeed(0F);
            position.setDirection(90F);
            dataPackTrip.setStartPosition(position);

            // 行程结束位置
            position = new DataPackPosition(dataPackObject);
            position.setPositioMode(DataPackPosition.POSITION_MODE_BEIDOU);
            position.setPositioModeDesc("北斗定位");
            position.setLongitude(114.317662);
            position.setLatitude(30.528563);
            position.setAltitude(15D);
            position.setSpeed(0F);
            position.setDirection(45F);
            dataPackTrip.setEndPosition(position);

            String rowKey = RowKeyUtil.makeRowKey(dataPackTrip.getVin(), DataPackObjectUtil.getDataType(dataPackTrip), dateFormat2.format(dataPackTrip.getDetectionTime()));
            String data = DataPackObjectUtil.toJson(dataPackTrip);

            // 输出HBase执行语句
            System.out.println(String.format("put 'telemetry', '%s', 'base:data', '%s'", rowKey, data));
        }
    }
}
