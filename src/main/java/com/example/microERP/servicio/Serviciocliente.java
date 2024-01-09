package com.example.microERP.servicio;

import com.example.microERP.modelo.Cliente;
import com.example.microERP.modelo.Pedido;
import com.example.microERP.repositorio.Repositoriocliente;
import com.example.microERP.repositorio.Repositoriopedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Serviciocliente {

    @Autowired
    private Repositoriocliente repositoriocliente;


    public List<Cliente> listartodos(){
        return repositoriocliente.findAll();
    }


    public List<Cliente> buscarporid(Long id){
        return repositoriocliente.findByid(id);
    }




    public ArrayList<Cliente> buscarporpedido(Cliente cliente){
        return repositoriocliente.findByPedido(cliente);
    }




}
