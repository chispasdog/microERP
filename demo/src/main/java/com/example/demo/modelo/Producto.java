package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre_producto;
    private int cantidad_del_producto;
    private String descripcion;
    private Double precio;

    public Producto(String nombre_producto, int cantidad_del_producto, String descripcion, Double precio) {
        this.nombre_producto = nombre_producto;
        this.cantidad_del_producto = cantidad_del_producto;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad_del_producto() {
        return cantidad_del_producto;
    }

    public void setCantidad_del_producto(int cantidad_del_producto) {
        this.cantidad_del_producto = cantidad_del_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
