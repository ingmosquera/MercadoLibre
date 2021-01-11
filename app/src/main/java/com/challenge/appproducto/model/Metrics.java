package com.challenge.appproducto.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Metrics  implements Serializable {
    @SerializedName("claims")
    @Expose
    private Claims claims;
    @SerializedName("delayed_handling_time")
    @Expose
    private DelayedHandlingTime delayedHandlingTime;
    @SerializedName("sales")
    @Expose
    private Sales sales;
    @SerializedName("cancellations")
    @Expose
    private Cancellations cancellations;

    public Claims getClaims() {
        return claims;
    }

    public void setClaims(Claims claims) {
        this.claims = claims;
    }

    public DelayedHandlingTime getDelayedHandlingTime() {
        return delayedHandlingTime;
    }

    public void setDelayedHandlingTime(DelayedHandlingTime delayedHandlingTime) {
        this.delayedHandlingTime = delayedHandlingTime;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public Cancellations getCancellations() {
        return cancellations;
    }

    public void setCancellations(Cancellations cancellations) {
        this.cancellations = cancellations;
    }
}
