package com.challenge.appproducto.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Sales implements Serializable {

    @SerializedName("period")
    @Expose
    private String period;
    @SerializedName("completed")
    @Expose
    private Integer completed;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

}