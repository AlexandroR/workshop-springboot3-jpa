package com.alexandroreis.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandroreis.curso.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
