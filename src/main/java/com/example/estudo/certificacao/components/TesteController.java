package com.example.estudo.certificacao.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TesteController {

	@Autowired
	private TesteAutoWired testeAutoWired;
	
	@Autowired(required=false)
	private TesteAutoWired testeNaoRequired;
	
	public String teste() {
		return testeAutoWired.teste();
	}
}
