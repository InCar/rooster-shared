package com.incarcloud.rooster.monitor;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 *  系统监控信息表
 */
public class SystemData implements Serializable{
    private final static long serialVersionUID=1L;
    //field
    //cpu物理核心
    private int physicalProcessorCount;

    //cpu逻辑核心
    private int  logicalProcessorCount;

    //cpu使用百分比
    private BigDecimal cpuUsePercent;

    //内存使用百分比
    private BigDecimal memoryUsePercent;

    //最大内存(GB)
    private BigDecimal memoryMax;

    //已使用内存(GB)
    private BigDecimal memoryUse;

    //磁盘最大容量(GB)
    private BigDecimal diskMax;

    //磁盘使用容量(GB)
    private BigDecimal diskUse;

    //网络流入速度(KBps)
    private BigDecimal netInSpeed;

    //网络流出速度(KBps)
    private BigDecimal netOutSpeed;

    //method


    public int getPhysicalProcessorCount() {
        return physicalProcessorCount;
    }

    public void setPhysicalProcessorCount(int physicalProcessorCount) {
        this.physicalProcessorCount = physicalProcessorCount;
    }

    public int getLogicalProcessorCount() {
        return logicalProcessorCount;
    }

    public void setLogicalProcessorCount(int logicalProcessorCount) {
        this.logicalProcessorCount = logicalProcessorCount;
    }

    public BigDecimal getCpuUsePercent() {
        return cpuUsePercent;
    }

    public void setCpuUsePercent(BigDecimal cpuUsePercent) {
        this.cpuUsePercent = cpuUsePercent;
    }

    public BigDecimal getMemoryUsePercent() {
        return memoryUsePercent;
    }

    public void setMemoryUsePercent(BigDecimal memoryUsePercent) {
        this.memoryUsePercent = memoryUsePercent;
    }

    public void setMemoryMax(BigDecimal memoryMax){
        this.memoryMax=memoryMax;
    }

    public BigDecimal getMemoryMax(){
        return this.memoryMax;
    }

    public void setMemoryUse(BigDecimal memoryUse){
        this.memoryUse=memoryUse;
    }

    public BigDecimal getMemoryUse(){
        return this.memoryUse;
    }

    public void setDiskMax(BigDecimal diskMax){
        this.diskMax=diskMax;
    }

    public BigDecimal getDiskMax(){
        return this.diskMax;
    }

    public void setDiskUse(BigDecimal diskUse){
        this.diskUse=diskUse;
    }

    public BigDecimal getDiskUse(){
        return this.diskUse;
    }

    public void setNetInSpeed(BigDecimal netInSpeed){
        this.netInSpeed=netInSpeed;
    }

    public BigDecimal getNetInSpeed(){
        return this.netInSpeed;
    }

    public void setNetOutSpeed(BigDecimal netOutSpeed){
        this.netOutSpeed=netOutSpeed;
    }

    public BigDecimal getNetOutSpeed(){
        return this.netOutSpeed;
    }

}
