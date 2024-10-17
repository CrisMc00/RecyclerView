package com.example.recyclerview.models;

import android.graphics.Color;

public class Tortuga {
    private String Nombre;
    private String Descripcion;
    private String Arma;
    private String color;

    public Tortuga(String nombre, String descripcion, String arma, String color) {
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Arma = arma;
        this.color = color;
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

    public String getArma() {
        return Arma;
    }

    public void setArma(String arma) {
        Arma = arma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
