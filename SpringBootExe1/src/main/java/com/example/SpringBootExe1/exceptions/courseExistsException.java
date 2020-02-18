package com.example.SpringBootExe1.exceptions;

public class courseExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public courseExistsException() {
		super("course name already exists! please choose another name");
	}

}
