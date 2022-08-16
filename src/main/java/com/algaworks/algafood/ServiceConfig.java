package com.algaworks.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.notifications.Notificador;
import com.algaworks.algafood.services.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
    AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
    	return new AtivacaoClienteService(notificador);
    }	
	
}
