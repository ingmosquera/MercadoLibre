package com.challenge.appproducto.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DelayedHandlingTime implements Serializable {

    @SerializedName("rate")
    @Expose
    private Integer rate;
    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("period")
    @Expose
    private String period;

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}