package com.algaworks.algafood.notifications;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.entities.Cliente;

@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através do e-mail %s usando SMTP: %s\n",
			cliente.getNome(), cliente.getEmail(), mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
