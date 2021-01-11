package com.challenge.appproducto.view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.challenge.appproducto.R;
import com.challenge.appproducto.adapter.ProductAdapter;
import com.challenge.appproducto.model.Product;
import com.challenge.appproducto.viewmodel.ProductViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ProductViewModel model;
    private RecyclerView rv;
    private TextView nombreProducto;
    private Dialog dialog;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model =new ViewModelProvider(this).get(ProductViewModel.class);
        model.init();
        rv = findViewById(R.id.prodcutosRv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(R.layout.progress);
        dialog = builder.create();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void BuscarProducto(View v){
        nombreProducto=findViewById(R.id.nombreProducto);
        if (TextUtils.isEmpty(nombreProducto.getText().toString())){
            Toast.makeText(this, "Debe diligenciar un producto a buscar", Toast.LENGTH_LONG).show();
        }else{
            try {
                setDialog(true);
                model.cargarProducto(nombreProducto.getText().toString());
                model.obtenerProducto().observe(this, new Observer<List<Product>>() {
                    @Override
                    public void onChanged(List<Product> products) {
                        ProductAdapter adapter = new ProductAdapter(products, MainActivity.this);
                        if (products.size() > 0){
                            adapter.setProducto(products);
                            rv.setAdapter(adapter);
                            setDialog(false);
                        }else {
                            setDialog(false);
                            Toast.makeText(MainActivity.this, "No se encontró información para el producto "+nombreProducto , Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }catch (Exception e){
                setDialog(false);
                Log.d("LuchitoTest", "Error al llamar el servicio " + e.getMessage());
                Toast.makeText(this, "Error al llamar el servicio", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void CancelarBusqueda (View v){
        nombreProducto.setText("");
        List<Product> products = new ArrayList<>();
        ProductAdapter adapter = new ProductAdapter(products, MainActivity.this);
        adapter.setProducto(products);
        rv.setAdapter(adapter);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setDialog(boolean show){
        if (show)dialog.show();
        else dialog.dismiss();
    }

}