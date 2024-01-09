package com.example.microERP.controladores;


import com.example.microERP.modelo.Cliente;
import com.example.microERP.modelo.Pedido;
import com.example.microERP.modelo.Producto;
import com.example.microERP.modelo.Usuario;
import com.example.microERP.servicio.ServicioProducto;
import com.example.microERP.servicio.Serviciocliente;
import com.example.microERP.servicio.Serviciopedido;
import com.example.microERP.servicio.Serviciousuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Crud {
    @Autowired
    ServicioProducto servicioProducto;

    @Autowired
    Serviciousuario serviciousuario;

    @Autowired
    Serviciopedido serviciopedido;

    @Autowired
    Serviciocliente serviciocliente;



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

    @GetMapping("/clientes")
    public List<Cliente> listarClientes() {
        return serviciocliente.listartodos();
    }

    @GetMapping("/clientes/{id}")
    public Cliente obtenerClientePorId(@PathVariable Long id) {
        return serviciocliente.buscarporid(id).stream().findFirst().orElse(null);
    }






}







