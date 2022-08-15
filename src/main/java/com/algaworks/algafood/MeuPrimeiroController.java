package com.algaworks.algafood;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuPrimeiroController {

	@GetMapping("/hello")
	public String hello() {
		return "Olá!";
	}
	
}
