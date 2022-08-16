package com.algaworks.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.notifications.NotificadorEmail;

@Configuration
public class NotificacaoConfig {

    @Bean
    NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);
        return notificador;
    }
	
}
