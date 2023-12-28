package com.example.demo.servicio;


import com.example.demo.modelo.Pedido;
import com.example.demo.repositorio.Repositoriopedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Serviciopedido {
    @Autowired
    private Repositoriopedido repositoriopedido;


    public List<Pedido> listartodos(){
        return repositoriopedido.findAll();
    }


    public List<Pedido> buscarporid(Long id){
        return repositoriopedido.findByid(id);
    }




    public ArrayList<Pedido> buscarporpedido(Pedido pedido){
        return repositoriopedido.findByPedido(pedido);
    }




}
