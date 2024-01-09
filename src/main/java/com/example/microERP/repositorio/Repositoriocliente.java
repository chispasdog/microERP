package com.example.microERP.repositorio;

import com.example.microERP.modelo.Cliente;
import com.example.microERP.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface Repositoriocliente extends JpaRepository<Cliente,Long> {

    List<Cliente> findByid(Long id);

    @Override
    List<Cliente> findAll();


    public ArrayList<Cliente> findByPedido(Cliente cliente);
}
