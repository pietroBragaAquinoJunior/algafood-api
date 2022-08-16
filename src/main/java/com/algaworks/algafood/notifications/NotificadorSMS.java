package com.algaworks.algafood.notifications;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.entities.Cliente;

@Component
public class NotificadorSMS implements Notificador {
	
	private boolean caixaAlta;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s por SMS  através do telefone %s: %s\n",
			cliente.getNome(), cliente.getTelefone(), mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
