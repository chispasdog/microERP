package com.example.microERP.controladores;


import com.example.microERP.modelo.Producto;
import com.example.microERP.servicio.ServicioProducto;
import com.example.microERP.servicio.Serviciopedido;
import com.example.microERP.servicio.Serviciousuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Principal {
    @Autowired
    ServicioProducto servicioProducto;

    @Autowired
    Serviciousuario serviciousuario;

    @Autowired
    Serviciopedido serviciopedido;




    @GetMapping("/")
    public String inicio(Model model){

        List<Producto> productos=servicioProducto.listartodos();
        model.addAttribute("productos", productos);

        //model.addAttribute("ultimoscomentarios", servicioComentarios.find3());

        return "index";
    }
}


