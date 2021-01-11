package com.challenge.appproducto.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Eshop implements Serializable {
    @SerializedName("nick_name")
    @Expose
    private String nickName;
    @SerializedName("eshop_rubro")
    @Expose
    private Object eshopRubro;
    @SerializedName("eshop_id")
    @Expose
    private Integer eshopId;
    @SerializedName("eshop_locations")
    @Expose
    private List<Object> eshopLocations = null;
    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("eshop_logo_url")
    @Expose
    private String eshopLogoUrl;
    @SerializedName("eshop_status_id")
    @Expose
    private Integer eshopStatusId;
    @SerializedName("seller")
    @Expose
    private Integer seller;
    @SerializedName("eshop_experience")
    @Expose
    private Integer eshopExperience;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Object getEshopRubro() {
        return eshopRubro;
    }

    public void setEshopRubro(Object eshopRubro) {
        this.eshopRubro = eshopRubro;
    }

    public Integer getEshopId() {
        return eshopId;
    }

    public void setEshopId(Integer eshopId) {
        this.eshopId = eshopId;
    }

    public List<Object> getEshopLocations() {
        return eshopLocations;
    }

    public void setEshopLocations(List<Object> eshopLocations) {
        this.eshopLocations = eshopLocations;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getEshopLogoUrl() {
        return eshopLogoUrl;
    }

    public void setEshopLogoUrl(String eshopLogoUrl) {
        this.eshopLogoUrl = eshopLogoUrl;
    }

    public Integer getEshopStatusId() {
        return eshopStatusId;
    }

    public void setEshopStatusId(Integer eshopStatusId) {
        this.eshopStatusId = eshopStatusId;
    }

    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public Integer getEshopExperience() {
        return eshopExperience;
    }

    public void setEshopExperience(Integer eshopExperience) {
        this.eshopExperience = eshopExperience;
    }
}
