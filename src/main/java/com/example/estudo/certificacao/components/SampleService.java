package com.example.estudo.certificacao.components;


import org.springframework.stereotype.Component;

@Component("sampleService")
public class SampleService {

	SampleService(){
		System.out.println("Construtor SampleService Chamado");
	}
	
	public void teste() {
		System.out.println("M�todo teste do service");
	}
}
