package com.example.itechnology.Adapter;

import androidx.annotation.NonNull;

public class ItemProducto {
    int id;
    String Nombre;
    String Descripcion;

    public ItemProducto(String nombre) {
        this.id = id;
        Nombre = nombre;
        Descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }
}

