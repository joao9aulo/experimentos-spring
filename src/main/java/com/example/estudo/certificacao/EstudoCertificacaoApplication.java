package com.example.estudo.certificacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@EnableAspectJAutoProxy
public class EstudoCertificacaoApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EstudoCertificacaoApplication.class, args);
		
		
		//Testando Funcionamento do AutoWired
//		TesteController controller = (TesteController) ctx.getBean("testeController");
//		
//		System.out.println(controller.teste());
		
		//Testando AOP
		//SampleService sampleService = (SampleService) ctx.getBean("sampleServiceProxy");
		//sampleService.checkName();
		
//		SampleService sampleService = (SampleService)ctx.getBean("sampleService");
//		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//		proxyFactoryBean.setInterceptorNames("beforeMethod");
//		proxyFactoryBean.setTarget(sampleService);
//		proxyFactoryBean.setBeanFactory(ctx);
//		
//		SampleService proxySampleService = (SampleService)proxyFactoryBean.getObject();
//		
//		proxySampleService.teste();
		
		//Testando transactional
		
//		ServiceTransacional serviceTransactional = (ServiceTransacional)ctx.getBean("serviceTransacional");
//		
//		serviceTransactional.metodoTransactional();
	}

}

