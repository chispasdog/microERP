package com.example.demo.repositorio;

import com.example.demo.modelo.Pedido;
import com.example.demo.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorioproducto extends JpaRepository<Producto,Long> {
}
