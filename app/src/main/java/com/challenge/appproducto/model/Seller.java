package com.challenge.appproducto.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Seller implements Serializable {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("registration_date")
    @Expose
    private String registrationDate;
    @SerializedName("car_dealer")
    @Expose
    private Boolean carDealer;
    @SerializedName("real_estate_agency")
    @Expose
    private Boolean realEstateAgency;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("eshop")
    @Expose
    private Eshop eshop;
    @SerializedName("seller_reputation")
    @Expose
    private SellerReputation sellerReputation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Boolean getCarDealer() {
        return carDealer;
    }

    public void setCarDealer(Boolean carDealer) {
        this.carDealer = carDealer;
    }

    public Boolean getRealEstateAgency() {
        return realEstateAgency;
    }

    public void setRealEstateAgency(Boolean realEstateAgency) {
        this.realEstateAgency = realEstateAgency;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Eshop getEshop() {
        return eshop;
    }

    public void setEshop(Eshop eshop) {
        this.eshop = eshop;
    }

    public SellerReputation getSellerReputation() {
        return sellerReputation;
    }

    public void setSellerReputation(SellerReputation sellerReputation) {
        this.sellerReputation = sellerReputation;
    }
}
