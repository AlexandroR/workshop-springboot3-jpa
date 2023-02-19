package com.alexandroreis.curso.ressources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandroreis.curso.entities.Usuario;
import com.alexandroreis.curso.services.UserService;

@RestController
@RequestMapping(value = "/usuarios")
public class UserRessource {
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		
		List<Usuario>list = service.findAall();
		return ResponseEntity.ok().body(list);
		
	}

}
