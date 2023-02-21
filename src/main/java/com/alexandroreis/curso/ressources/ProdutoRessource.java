package com.alexandroreis.curso.ressources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandroreis.curso.entities.Produto;
import com.alexandroreis.curso.services.ProdutoService;


@RestController
@RequestMapping(value = "/produtos")
public class ProdutoRessource {
	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		
		List<Produto>list = service.findAall();
		return ResponseEntity.ok().body(list);
		
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto>findById(@PathVariable Long id){
		
		Produto obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
		
		
	}
	

}
