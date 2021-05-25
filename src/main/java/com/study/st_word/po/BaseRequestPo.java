package com.study.st_word.po;

/**
 * @author songdechuan
 * @date 2020-11-06 2:31
 */
public class BaseRequestPo {
    private Integer type;

    private String startTime;

    private String endTime;

    private Integer systemType;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public void setSystemType(Integer systemType) {
        this.systemType = systemType;
    }
}
