package com.challenge.appproducto.repository;

import androidx.lifecycle.MutableLiveData;

import com.challenge.appproducto.model.Product;

import java.util.List;

public interface ProductRepository {
    MutableLiveData<List<Product>> obtenerProducto();

    void cargarProducto(String nombreProducto);
}
