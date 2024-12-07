package com.product.Exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException() {
		super("Resource Not Found!");
	}
	public ResourceNotFoundException(String Message) {
		super(Message);
	}

}
