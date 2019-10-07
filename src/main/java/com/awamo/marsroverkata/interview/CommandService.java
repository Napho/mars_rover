package com.awamo.marsroverkata.interview;

import com.awamo.marsroverkata.interview.utils.Constants;

/**
 * CommandService Interface holds commands that are supported by the rover object
 * @author boss
 *
 */
public interface CommandService {

	
	String moveRover(String currentDirection,String currentCordValue);
	String turnRover(String currentDirection);
	
	default String getNewDirection(String currentDirection, String command) {

		switch (currentDirection) {
		case Constants.NORTH:
			break;
		case Constants.SOUTH:
			break;
		case Constants.EAST:
			break;
		case Constants.WEST:
			break;
		default:

		}

		return "0,0,W";

	}
	
	
}
