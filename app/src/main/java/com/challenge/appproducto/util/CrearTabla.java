package com.challenge.appproducto.util;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.challenge.appproducto.model.Attribute;

import java.util.ArrayList;

public class CrearTabla {
    private TableLayout tabla;
    private Context contexto;
    private  String[] encabezado;
    private ArrayList<String[]> datos;
    private TableRow fila;
    private TextView celda;
    private int indexColumna;
    private static final int COLUMNAS_ENCABEZADO = 2;

    public CrearTabla(TableLayout tabla, Context contexto) {
        this.tabla = tabla;
        this.contexto = contexto;
        datos = new ArrayList<String[]>();
    }

    public void AdicionarEncabezado (String[] encabezado){
       this.encabezado =encabezado;
        crearEncabezado();
    }

    public void AdicionarDatos (ArrayList<Attribute> filas){
        for(Attribute data: filas){
            if (!TextUtils.isEmpty(data.getValueName())) {
                String[] item = new String[]{data.getName(),data.getValueName()};
                AdicionarDatos(item);
            }
        }
    }

    private void AdicionarDatos (String[] item){
        String info;
        datos.add(item);
        indexColumna = 0;
        nuevaFila();
        while (indexColumna< COLUMNAS_ENCABEZADO){
            nuevaCelda();
            info = (indexColumna<item.length)?item[indexColumna++]:"";
            celda.setText(info);
            fila.addView(celda,parametrosFilaTabla());
        }
        tabla.addView(fila,datos.size()-1);
    }

    private void nuevaFila(){
        fila = new TableRow(contexto);
    }

    private void nuevaCelda(){
        celda = new TextView(contexto);
        celda.setGravity(Gravity.CENTER);
        celda.setTextSize(10);
        celda.setBackgroundColor(Color.LTGRAY);
    }

    private void crearEncabezado (){
        indexColumna=0;
        nuevaFila();
        while(indexColumna< encabezado.length ){
            nuevaCelda();
            celda.setText(encabezado[indexColumna++]);
            fila.addView(celda,parametrosFilaTabla());
        }
        tabla.addView(fila);
    }

    private TableRow.LayoutParams parametrosFilaTabla(){
        TableRow.LayoutParams parametros = new TableRow.LayoutParams();
        parametros.setMargins(1,1,1,1);
        parametros.weight = 1;
        return  parametros;
    }
}
