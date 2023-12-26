package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String direccion_envio;
    private int cantidad_delpeido;
    private Date fecha_entrega;


    public Pedido(String direccion_envio, int cantidad_delpeido, Date fecha_entrega) {
        this.direccion_envio = direccion_envio;
        this.cantidad_delpeido = cantidad_delpeido;
        this.fecha_entrega = fecha_entrega;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public int getCantidad_delpeido() {
        return cantidad_delpeido;
    }

    public void setCantidad_delpeido(int cantidad_delpeido) {
        this.cantidad_delpeido = cantidad_delpeido;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
}
