package com.example.estudo.certificacao.components;

import org.springframework.stereotype.Component;

@Component("testeAutoWired")
public class TesteAutoWired {

	TesteAutoWired() {
		System.out.println("Construtor chamado para o testeAutoWired");
	}

	public String teste() {
		return "OK!!!";
	}
}
