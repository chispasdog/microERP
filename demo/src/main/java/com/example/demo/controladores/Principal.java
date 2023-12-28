package com.example.demo.controladores;

import com.example.demo.servicio.ServicioProducto;
import com.example.demo.servicio.Serviciopedido;
import com.example.demo.servicio.Serviciousuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Principal {
    @Autowired
    ServicioProducto servicioProducto;

    @Autowired
    Serviciousuario serviciousuario;

    @Autowired
    Serviciopedido serviciopedido;


}
