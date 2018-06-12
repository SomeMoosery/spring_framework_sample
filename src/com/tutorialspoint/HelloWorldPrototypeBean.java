package com.tutorialspoint;

public class HelloWorldPrototypeBean{
	public String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Your Message: " + message);
	}
}