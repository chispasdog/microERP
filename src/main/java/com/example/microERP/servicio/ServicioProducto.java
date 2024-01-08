package com.example.microERP.servicio;


import com.example.microERP.modelo.Producto;
import com.example.microERP.repositorio.Repositorioproducto;
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