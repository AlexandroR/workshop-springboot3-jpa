package com.alexandroreis.curso.ressources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandroreis.curso.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UserRessource {
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		
		Usuario u = new Usuario(1L, "Maria", "maria@gmail.com", "999999999", "12345");
		
		return ResponseEntity.ok().body(u);
		
	}

}
