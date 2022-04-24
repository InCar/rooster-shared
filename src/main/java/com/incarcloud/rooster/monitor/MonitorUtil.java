package com.incarcloud.rooster.monitor;

import com.incarcloud.rooster.util.GsonFactory;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;
import oshi.software.os.OperatingSystem;
import oshi.util.Util;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 监控信息采集工具类
 */
public class MonitorUtil {
    private final static double GB=1024*1024*1024;
    private final static double MB=1024*1024;

    private final static double KB=1024;

    private static BigDecimal formatData(BigDecimal data){
        return data.setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 此方法会阻塞1秒
     * @return
     */
    public static SystemData collect(){
        SystemData systemData = new SystemData();
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        OperatingSystem os = si.getOperatingSystem();
        //cpu
        CentralProcessor processor = hal.getProcessor();
        systemData.setPhysicalProcessorCount(processor.getPhysicalProcessorCount());
        systemData.setLogicalProcessorCount(processor.getLogicalProcessorCount());

        //网络
        long prevRecv=0;
        long prevSent=0;
        for (NetworkIF net : hal.getNetworkIFs()) {
            prevRecv+=net.getBytesRecv();
            prevSent+=net.getBytesSent();
        }

        final long[] oldTickets = processor.getSystemCpuLoadTicks();

        Util.sleep(1000L);

        final double systemCpuLoadBetweenTicks = processor.getSystemCpuLoadBetweenTicks(oldTickets);
        systemData.setCpuUsePercent(formatData(BigDecimal.valueOf(systemCpuLoadBetweenTicks*100)));
        //内存
        GlobalMemory memory = hal.getMemory();
        systemData.setMemoryMax(formatData(BigDecimal.valueOf(memory.getTotal()/GB)));
        systemData.setMemoryUse(formatData(BigDecimal.valueOf((memory.getTotal()-memory.getAvailable())/GB)));
        BigDecimal value = systemData.getMemoryUse().divide(systemData.getMemoryMax(),4,BigDecimal.ROUND_HALF_UP);
        systemData.setMemoryUsePercent(formatData(value.multiply(new BigDecimal("100"))));
        //磁盘
        FileSystem fileSystem = os.getFileSystem();
        final List<HWDiskStore> hwDiskStores = hal.getDiskStores();
        double total = 0d;
        for (HWDiskStore disk : hwDiskStores) {
            total+=disk.getSize()/GB;
        }
        List<OSFileStore> osFileStores = fileSystem.getFileStores();
        double use = 0d;
        for (OSFileStore fs : osFileStores) {
            use+=fs.getUsableSpace()/GB;
        }
        systemData.setDiskMax(formatData(BigDecimal.valueOf(total)));
        systemData.setDiskUse(formatData(BigDecimal.valueOf(total-use)));


        long allRecv=0;
        long allSent=0;
        for (NetworkIF net : hal.getNetworkIFs()) {
            net.updateAttributes();
            allRecv+=net.getBytesRecv();
            allSent+=net.getBytesSent();
        }
        systemData.setNetInSpeed(formatData(BigDecimal.valueOf((allRecv-prevRecv)/KB)));
        systemData.setNetOutSpeed(formatData(BigDecimal.valueOf((allSent-prevSent)/KB)));
        return systemData;
    }


    public static void main(String[] args){
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(()->{
            SystemData systemData= collect();
            System.out.println(GsonFactory.newInstance().createGson().toJson(systemData));
        },1000L,2000L, TimeUnit.MILLISECONDS);
    }
}