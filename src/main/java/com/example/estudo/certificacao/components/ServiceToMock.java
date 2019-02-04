package com.example.estudo.certificacao.components;

import org.springframework.stereotype.Component;

@Component("serviceToMock")
public class ServiceToMock {

	public int somar(int a, int b) {
		return a + b;
	}
}
