package com.challenge.appproducto.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.challenge.appproducto.model.Product;
import com.challenge.appproducto.model.ProductObservable;

import java.util.List;

public class ProductViewModel  extends AndroidViewModel {
    private ProductObservable productObservable;

    public ProductViewModel(@NonNull Application application) {
        super(application);
    }

    public void init() {
        productObservable = new ProductObservable();
    }

    public void cargarProducto (String NombreProducto){
        productObservable.CargarProductos(NombreProducto);
    }

    public MutableLiveData<List<Product>> obtenerProducto(){
        return productObservable.obtenerProducto();
    }
    public Product ObtenerProducto(int posicion,String nombreProducto){
        MutableLiveData<List<Product>> producto = productObservable.obtenerProducto();
        return producto.getValue().get(posicion);
    }
}
