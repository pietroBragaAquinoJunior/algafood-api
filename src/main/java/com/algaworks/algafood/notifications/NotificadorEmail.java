package com.algaworks.algafood.notifications;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.entities.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
//	public NotificadorEmail(String hostServidorSmtp) {
//		this.hostServidorSmtp = hostServidorSmtp;
//		System.out.println("NotificadorEmail");
//	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n",
			cliente.getNome(), this.hostServidorSmtp, cliente.getEmail(), mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
