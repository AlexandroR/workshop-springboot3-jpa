package com.alexandroreis.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandroreis.curso.entities.Pedido;
import com.alexandroreis.curso.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;

	public List<Pedido> findAall() {

		return repository.findAll();

	}

	public Pedido findById(Long id) {

		Optional<Pedido> obj = repository.findById(id);
		return obj.get();

	}

}
