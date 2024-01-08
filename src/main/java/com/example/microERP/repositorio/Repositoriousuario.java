package com.example.microERP.repositorio;


import com.example.microERP.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface Repositoriousuario extends JpaRepository<Usuario,Long> {


    List<Usuario> findByid(Long id);

    @Override
    List<Usuario> findAll();


    public ArrayList<Usuario> findByUsuario(Usuario usuario);


}