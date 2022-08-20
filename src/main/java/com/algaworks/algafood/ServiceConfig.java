package com.algaworks.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.services.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean(initMethod = "init")
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService();
	}
	
	
}
