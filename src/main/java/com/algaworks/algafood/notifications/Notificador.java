package com.algaworks.algafood.notifications;

import com.algaworks.algafood.entities.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}