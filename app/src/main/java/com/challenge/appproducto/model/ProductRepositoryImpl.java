package com.challenge.appproducto.model;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.challenge.appproducto.repository.ProductRepository;
import com.challenge.appproducto.service.ApiService;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductRepositoryImpl implements ProductRepository {
    private MutableLiveData<List<Product>> products = new MutableLiveData<List<Product>>();

    public MutableLiveData<List<Product>> obtenerProducto(){
        return products;
    }

    public void cargarProducto(String nombreProducto){
        final Call<JsonObject> apiService =  ApiService.getApiService().getProductForName(nombreProducto);
        apiService.enqueue(new Callback<JsonObject>() {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                JsonArray JSONLista = response.body().getAsJsonArray("results");
                Gson gson = new Gson();
                Type type = new TypeToken<List<Product>>(){}.getType();
                List<Product> contactList = gson.fromJson(JSONLista, type);
                products.postValue(contactList);
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                products.postValue(null);
                apiService.cancel();
            }
        });
    }
}
