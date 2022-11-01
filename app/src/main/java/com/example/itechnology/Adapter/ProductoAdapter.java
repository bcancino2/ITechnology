package com.example.itechnology.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itechnology.R;

import java.util.ArrayList;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ViewHolder>{
    private ArrayList<ItemProducto> itemArrayList;
    private Context context;

    public ProductoAdapter(Context context,ArrayList<ItemProducto> itemArrayList) {
        this.context = context;
        this.itemArrayList = itemArrayList;

    }

    @NonNull
    @Override
    public ProductoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoAdapter.ViewHolder holder, int position) {
        ItemProducto item = itemArrayList.get(position);
        holder.textNombre.setText(item.Nombre);
        holder.textDescripcion.setText(item.Descripcion);

    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textNombre;
        TextView textDescripcion;


        public ViewHolder(@NonNull View view){
        super(view);
        textNombre = view.findViewById(R.id.nombreItem);
        textDescripcion = view.findViewById(R.id.descItem);

    }
    }
}
