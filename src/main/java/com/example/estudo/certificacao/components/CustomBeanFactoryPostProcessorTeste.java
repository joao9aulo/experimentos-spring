package com.example.estudo.certificacao.components;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component("customBeanFactoryPostProcessorTeste")
public class CustomBeanFactoryPostProcessorTeste implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Listando nomes de beans antes de serem inicializados");
		
		for (String beanName : beanFactory.getBeanDefinitionNames()) {

            //A bean implementing BeanFactoryPostProcessor is called when all bean definitions will have been loaded, 
            //but no beans will have been instantiated yet. This allows for overriding or adding properties even to 
            //eager-initializing beans. This will let you have access to all the beans that you have defined in XML or that are 
            //annotated (scanned via component-scan).
            // Manipulate the beanDefiniton or whatever you need to do
			//BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
			
            System.out.println(beanName);
            
        }
		
	}

}
