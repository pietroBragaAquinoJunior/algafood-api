package com.algaworks.algafood;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.entities.Cliente;
import com.algaworks.algafood.services.AtivacaoClienteService;

@RestController
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		System.out.println("MeuPrimeiroController: "+ativacaoClienteService);
	}

	@GetMapping("/hello")
	public String hello() {
		Cliente joao = new Cliente("João", "joao@gmail.com", "10254568");
		ativacaoClienteService.ativar(joao);
		return "Olá!";
	}
	
}
