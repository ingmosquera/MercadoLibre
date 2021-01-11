package com.challenge.appproducto.model;

import androidx.databinding.BaseObservable;
import androidx.lifecycle.MutableLiveData;

import com.challenge.appproducto.repository.ProductRepository;

import java.util.List;

public class ProductObservable extends BaseObservable {
    ProductRepository productRepository = new ProductRepositoryImpl();

    public void CargarProductos (String NombreProducto){
        productRepository.cargarProducto(NombreProducto);
    }

    public MutableLiveData<List<Product>> obtenerProducto(){
        return productRepository.obtenerProducto();
    }
}