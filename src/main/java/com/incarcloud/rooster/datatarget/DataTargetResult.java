package com.incarcloud.rooster.datatarget;

import java.util.Date;

/**
 * 设备回复下行命令执行结果
 *
 * @author sunjun, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataTargetResult extends DataTarget {

    /**
     * 经度
     */
    private Integer resultCode;

    public DataTargetResult() {
    }

    public DataTargetResult(DataTarget target) {
        super(target);
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }
}
