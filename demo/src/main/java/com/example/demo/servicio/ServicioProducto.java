package com.example.demo.servicio;

import com.example.demo.modelo.Pedido;
import com.example.demo.modelo.Producto;
import com.example.demo.repositorio.Repositoriopedido;
import com.example.demo.repositorio.Repositorioproducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioProducto {
    @Autowired
    private Repositorioproducto repositorioproducto;


    public List<Producto> listartodos(){
        return repositorioproducto.findAll();
    }


    public List<Producto> buscarporid(Long id){
        return repositorioproducto.findByid(id);
    }




    public ArrayList<Producto> buscarporpedido(Producto producto){
        return repositorioproducto.findByProducto(producto);
    }



}
