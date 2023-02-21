package com.alexandroreis.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alexandroreis.curso.entities.Categoria;
import com.alexandroreis.curso.entities.Pedido;
import com.alexandroreis.curso.entities.Produto;
import com.alexandroreis.curso.entities.Usuario;
import com.alexandroreis.curso.entities.enums.StatusDoPedido;
import com.alexandroreis.curso.repositories.CategoriaRepository;
import com.alexandroreis.curso.repositories.PedidoRepository;
import com.alexandroreis.curso.repositories.ProdutoRepository;
import com.alexandroreis.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	ProdutoRepository produtoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Eletrônicos");
		Categoria cat2 = new Categoria(null,"Livros");
		Categoria cat3 = new Categoria(null,"Computadores");
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		Produto prod1 = new Produto(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Produto prod2 = new Produto(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Produto prod3 = new Produto(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Produto prod4 = new Produto(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Produto prod5 = new Produto(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
		produtoRepository.saveAll(Arrays.asList(prod1,prod2,prod3,prod4,prod5));

		
		Usuario u1 = new Usuario(null,"Maria Brown","maria@gmail.com","988888888","123456");
		Usuario u2 = new Usuario(null,"Alex Green","alex@gmail.com","977777777","123465");
		
		Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"),StatusDoPedido.PAGO, u1); 
		Pedido p2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"),StatusDoPedido.AGUARDANDO_PAGAMENTO, u2); 
		Pedido p3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"),StatusDoPedido.AGUARDANDO_PAGAMENTO, u1); 
		
		



		
		userRepository.saveAll(Arrays.asList(u1,u2));
		pedidoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		
	}

}
