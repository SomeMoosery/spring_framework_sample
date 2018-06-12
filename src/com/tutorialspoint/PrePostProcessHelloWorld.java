package com.tutorialspoint;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class PrePostProcessHelloWorld implements BeanPostProcessor{
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("Before Initialization: " + beanName);
		return bean; // You can return any other object here as well
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("After Initialization: " + beanName);
		return bean; // Again, you can return any other object here as well
	}
}