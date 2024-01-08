package com.example.microERP.repositorio;


import com.example.microERP.modelo.Pedido;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface Repositoriopedido extends JpaRepository<Pedido,Long> {

    List<Pedido> findByid(Long id);

    @Override
    List<Pedido> findAll();


    public ArrayList<Pedido> findByPedido(Pedido pedido);

}
