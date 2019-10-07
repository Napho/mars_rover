package com.awamo.marsroverkata.interview;

/**
 * CommandService Interface holds commands that are supported by the rover object
 * @author boss
 *
 */
public interface CommandService {

	
	String moveRover(String currentDirection,String currentCordValue);
	String turnRover(String currentDirection);
	
}
