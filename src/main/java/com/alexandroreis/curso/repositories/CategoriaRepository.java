package com.alexandroreis.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandroreis.curso.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
