package com.alexandroreis.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandroreis.curso.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}
