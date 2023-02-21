package com.alexandroreis.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandroreis.curso.entities.Produto;
import com.alexandroreis.curso.repositories.ProdutoRepository;


@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> findAall(){
		
		return repository.findAll();
		
	}
	public Produto findById(Long id) {
		
		Optional<Produto>obj = repository.findById(id);
		return obj.get();

	}

}
