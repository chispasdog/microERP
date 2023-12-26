package com.example.demo.repositorio;

import com.example.demo.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositoriopedido extends JpaRepository<Pedido,Long> {
}
