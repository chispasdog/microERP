package com.example.demo.servicio;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.Repositorioproducto;
import com.example.demo.repositorio.Repositoriousuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Serviciousuario {

    @Autowired
    private Repositoriousuario repositoriousuario;


    public List<Usuario> listartodos(){
        return repositoriousuario.findAll();
    }


    public List<Usuario> buscarporid(Long id){
        return repositoriousuario.findByid(id);
    }




    public ArrayList<Usuario> buscarporpedido(Usuario usuario){
        return repositoriousuario.findByUsuario(usuario);
    }


}
