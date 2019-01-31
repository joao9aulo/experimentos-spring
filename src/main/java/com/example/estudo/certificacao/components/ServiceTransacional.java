package com.example.estudo.certificacao.components;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("serviceTransacional")
@Transactional
public class ServiceTransacional {
	
	public void metodoTransactional() {
		System.out.println("Método transactional");
	}

}
