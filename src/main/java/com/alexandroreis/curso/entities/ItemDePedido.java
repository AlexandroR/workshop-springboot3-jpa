package com.alexandroreis.curso.entities;

import java.io.Serializable;
import java.util.Objects;

import com.alexandroreis.curso.entities.pk.ItemDePedidoPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido_item")
public class ItemDePedido implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @EmbeddedId
	private ItemDePedidoPK id;
	
	private Integer quantidade;
	private Double preco;
	public ItemDePedido() {
		
	}
	public ItemDePedido(Pedido pedido,Produto produto,Integer quantidade, Double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
		id.setPedido(pedido);
		id.setProduto(produto);
	}
	
	public Pedido getPedido() {
		return id.getPedido();
		
	}
	public void setPedido(Pedido pedido) {
		id.setPedido(pedido);
		
	}
	public Produto getProduto() {
		return id.getProduto();
		
	}
	public void setPedido(Produto produto) {
		id.setProduto(produto);
		
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
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
		ItemDePedido other = (ItemDePedido) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	

}
