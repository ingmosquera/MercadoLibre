package com.challenge.appproducto.service;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProductService {
    @GET("search?")
    Call<JsonObject> getProductForName(@Query("q") String producName);
}
