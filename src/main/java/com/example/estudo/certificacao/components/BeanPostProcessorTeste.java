package com.example.estudo.certificacao.components;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component("beanPostProcessorTeste")
public class BeanPostProcessorTeste implements BeanPostProcessor {

	@Nullable
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		//operate on bean (or object) instances which means that when the Spring IoC container instantiates a bean instance then 
		//BeanPostProcessor interfaces do their work.
		
		System.out.println(beanName);
		System.out.println("Utilizando Post Process");
		
		return bean;
	}
}
