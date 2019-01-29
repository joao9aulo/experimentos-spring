package com.example.estudo.certificacao.components;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component("beforeMethod")
public class BeforeMethod implements MethodBeforeAdvice
{
	@Override
	public void before(java.lang.reflect.Method method, Object[] args, Object target) throws Throwable {
		 System.out.println("Execute before method!");
	}
}