package com.alexandroreis.curso.ressources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandroreis.curso.entities.Pedido;
import com.alexandroreis.curso.services.PedidoService;
import com.alexandroreis.curso.services.UserService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoRessource {
	@Autowired
	private PedidoService service;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll(){
		
		List<Pedido>list = service.findAall();
		return ResponseEntity.ok().body(list);
		
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido>findById(@PathVariable Long id){
		
		Pedido obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
		
		
	}
	

}
