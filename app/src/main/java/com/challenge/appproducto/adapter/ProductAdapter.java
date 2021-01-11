package com.challenge.appproducto.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.challenge.appproducto.R;
import com.challenge.appproducto.model.Product;
import com.challenge.appproducto.view.detalleProducto;

import java.io.Serializable;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder>  {
    private List<Product> results;
    private LayoutInflater layoutInflater;
    private Context context;

    public ProductAdapter(List<Product> results, Context context) {
        this.results = results;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ProductAdapter.ProductHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View itemView = layoutInflater.inflate(R.layout.product_element,null);
        return new ProductAdapter.ProductHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ProductAdapter.ProductHolder holder, final int position){
        final Product product = results.get(position);

        String nombre = product.getTitle();
        String precio = product.getPrice().toString();
        String idNombre = product.getId();
        String currency = product.getCurrencyId();

        holder.nombreProduto.setText("Nombre: "+nombre);
        holder.precioProducto.setText("Precio: "+precio +" "+currency);
        holder.otroDatoProducto.setText("Id: "+idNombre);
        if (product.getThumbnail() != null){
            String url = product.getThumbnail();
            Glide.with(holder.itemView.getContext())
                    .load(url)
                    .dontAnimate()
                    .into(holder.imagenProducto);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), detalleProducto.class);
                intent.putExtra("infoProducto", (Serializable) product);
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public void setProducto(List<Product> results) {
        this.results = results;
        notifyDataSetChanged();
    }

    class ProductHolder  extends RecyclerView.ViewHolder {
        private TextView nombreProduto, precioProducto,otroDatoProducto;
        private ImageView imagenProducto;
        private Context mContext;
        public ProductHolder(View itemView) {
            super(itemView);
            nombreProduto = itemView.findViewById(R.id.nombreProductoTextView);
            precioProducto = itemView.findViewById(R.id.precioProductoTextView);
            otroDatoProducto = itemView.findViewById(R.id.estatusTextView);
            imagenProducto = itemView.findViewById(R.id.imagenProductoimagen);
            mContext = itemView.getContext();
        }


    }
}
