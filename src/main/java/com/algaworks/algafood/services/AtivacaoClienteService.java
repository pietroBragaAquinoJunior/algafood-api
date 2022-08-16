package com.algaworks.algafood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.entities.Cliente;
import com.algaworks.algafood.notifications.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	private List<Notificador> notificadores;
	
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	}
//	
//	public AtivacaoClienteService(String qualquer) {
//			
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		for(Notificador notificador : notificadores){
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}
	}

}
