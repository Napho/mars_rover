package com.awamo.marsroverkata.interview.exceptions;

/**
 * UnknownDirectionException is raised when direction other than N,E,S,W is recieved in commands to rover
 * @author naphlin
 *
 */
public class UnknownDirectionException extends RuntimeException{

	/**
	 * Default Serial ID
	 */
	private static final long serialVersionUID = 1L;
	
	private final String command;
	
	public UnknownDirectionException(String command) {
		super();	
		this.command = command;
		
	}
	
	@Override
	public String getMessage() {
		return "Unknown command "+this.command+" encountered during navigation. Supported operations are L,R,B,F";
	}
	

}
