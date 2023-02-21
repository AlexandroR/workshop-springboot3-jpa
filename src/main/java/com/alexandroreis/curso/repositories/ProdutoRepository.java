package com.alexandroreis.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandroreis.curso.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
