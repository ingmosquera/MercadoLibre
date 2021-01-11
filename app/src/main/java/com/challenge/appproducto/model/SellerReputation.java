package com.challenge.appproducto.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SellerReputation implements Serializable {
    @SerializedName("transactions")
    @Expose
    private Transactions transactions;
    @SerializedName("power_seller_status")
    @Expose
    private String powerSellerStatus;
    @SerializedName("metrics")
    @Expose
    private Metrics metrics;
    @SerializedName("level_id")
    @Expose
    private String levelId;

    public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }

    public String getPowerSellerStatus() {
        return powerSellerStatus;
    }

    public void setPowerSellerStatus(String powerSellerStatus) {
        this.powerSellerStatus = powerSellerStatus;
    }

    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }
}
