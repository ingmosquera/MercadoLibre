package com.challenge.appproducto.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.challenge.appproducto.R;
import com.challenge.appproducto.model.Attribute;
import com.challenge.appproducto.model.Product;
import com.challenge.appproducto.util.CrearTabla;

import java.util.ArrayList;

public class detalleProducto extends AppCompatActivity {
    private TextView tvTitleDetail;
    private TextView tvDetIdProducto;
    private TextView tvPrecioProducto;
    private ImageView imgDetalleProducto;
    private TableLayout tblDetalleProducto;
    private CrearTabla tabla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_producto);
        tblDetalleProducto = findViewById(R.id.tblDetalleProducto);
        tabla = new CrearTabla(tblDetalleProducto,getApplicationContext());
        datosProducto();
    }

    public void datosProducto(){
        Product product = (Product)getIntent().getSerializableExtra("infoProducto");
        tvTitleDetail = findViewById(R.id.tvTituloProducto);
        tvDetIdProducto= findViewById(R.id.tvDetIdProducto);
        tvPrecioProducto = findViewById(R.id.tvPrecioProducto);
        imgDetalleProducto = findViewById(R.id.imgDetalleProducto);
        tvTitleDetail.setText(product.getTitle());
        tvDetIdProducto.setText("Id: "+product.getId());
        tvPrecioProducto.setText("Precio: "+product.getPrice().toString() +" "+product.getCurrencyId());
        Glide.with(this)
                .load(product.getThumbnail())
                .dontAnimate()
                .into(imgDetalleProducto);
        tabla.AdicionarDatos((ArrayList<Attribute>) product.getAttributes());
    }
    public void Regresar(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}