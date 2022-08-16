package com.algaworks.algafood.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.entities.Cliente;
import com.algaworks.algafood.notifications.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService: "+notificador);
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
