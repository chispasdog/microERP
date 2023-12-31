package com.example.microERP.repositorio;


import com.example.microERP.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface Repositorioproducto extends JpaRepository<Producto,Long> {


    List<Producto> findByid(Long id);

    @Override
    List<Producto> findAll();


    public ArrayList<Producto> findByProducto(Producto producto);


}