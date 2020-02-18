package com.example.SpringBootExe1.exceptions;

public class emailExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public emailExistsException() {
		super("email is already in table");
	}

}
