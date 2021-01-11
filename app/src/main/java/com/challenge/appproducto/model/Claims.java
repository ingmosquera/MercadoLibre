package com.challenge.appproducto.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Claims implements Serializable {

    @SerializedName("rate")
    @Expose
    private Double rate;
    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("period")
    @Expose
    private String period;

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
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