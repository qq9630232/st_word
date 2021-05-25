package com.study.st_word.bo;

/**
 * @author songdechuan
 * @date 2020-11-05 13:06
 */
public class RecordRequestBo {

    private Integer type;

    private String startTime;

    private String endTime;

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
}
