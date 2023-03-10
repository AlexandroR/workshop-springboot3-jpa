package com.alexandroreis.curso.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.alexandroreis.curso.entities.enums.StatusDoPedido;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone = "GMT")
	private Instant momento;
	private Integer statusDoPedido;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Usuario cliente;

	public Pedido() {
		
	}

	public Pedido(Long id, Instant momento,StatusDoPedido statusDoPedido,Usuario cliente ) {
		this.id = id;
		this.momento = momento;
		setStatusDoPedido(statusDoPedido);
		this.cliente = cliente;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}
	
	public StatusDoPedido getStatusDoPedido() {
		return StatusDoPedido.valueOf(statusDoPedido);
	}

	public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
		
		if(statusDoPedido!=null) {
			this.statusDoPedido = statusDoPedido.getCod();
			
		}
		
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	

}
