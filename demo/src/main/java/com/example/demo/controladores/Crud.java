package com.example.demo.controladores;

import com.example.demo.modelo.Pedido;
import com.example.demo.modelo.Producto;
import com.example.demo.modelo.Usuario;
import com.example.demo.servicio.ServicioProducto;
import com.example.demo.servicio.Serviciopedido;
import com.example.demo.servicio.Serviciousuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class Crud {
    @Autowired
    ServicioProducto servicioProducto;

    @Autowired
    Serviciousuario serviciousuario;

    @Autowired
    Serviciopedido serviciopedido;



    @GetMapping("/pedidos")
    public List<Pedido> listarPedidos() {
        return serviciopedido.listartodos();
    }



    @GetMapping("/pedidos/{id}")
    public List<Pedido> CogerPedidoPorId(@PathVariable Long id) {
        return serviciopedido.buscarporid(id);
    }


    @GetMapping("/productos")
    public List<Producto> listarProductos() {
        return servicioProducto.listartodos();
    }


    @GetMapping("/productos/{id}")
    public List<Producto> CogerProductoPorId(@PathVariable Long id) {
        return servicioProducto.buscarporid(id);
    }



    @GetMapping("/usuarios")
    public List<Usuario> listarUsuarios() {
        return serviciousuario.listartodos();
    }

    @GetMapping("/usuarios/{id}")
    public List<Usuario> CogerUsuarioPorId(@PathVariable Long id) {
        return serviciousuario.buscarporid(id);
    }




}
