package com.alexandroreis.curso.ressources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandroreis.curso.entities.Categoria;
import com.alexandroreis.curso.services.CategoriaService;


@RestController
@RequestMapping(value = "/categorias")
public class CategoriaRessource {
	@Autowired
	private CategoriaService service;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		
		List<Categoria>list = service.findAall();
		return ResponseEntity.ok().body(list);
		
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria>findById(@PathVariable Long id){
		
		Categoria obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
		
		
	}
	

}
