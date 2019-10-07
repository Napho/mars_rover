package com.awamo.marsroverkata.interview.utils;

public class Helpers {
	
	
	public static String getNewDirection(String currentDirection, String command) {

		switch (currentDirection) {
		case Constants.NORTH:
			if(command == Commands.L.name()) {
				return Constants.WEST;
			}else if(command == Commands.R.name()) {
				return Constants.EAST;
			}
			
		case Constants.SOUTH:
			if(command == Commands.L.name()) {
				return Constants.EAST;
			}else if(command == Commands.R.name()) {
				return Constants.WEST;
			}
		case Constants.EAST:
			if(command == Commands.L.name()) {
				return Constants.NORTH;
			}else if(command == Commands.R.name()) {
				return Constants.SOUTH;
			}
		case Constants.WEST:
			if(command == Commands.L.name()) {
				return Constants.SOUTH;
			}else if(command == Commands.R.name()) {
				return Constants.NORTH;
			}
		default:

		}

		return currentDirection;

	}
	
	public static String getNewCordinates(int currentX, int currentY, String direction, String command) {

		int[] newCordinateAddition = manageCordinates(direction);
		switch (command) {
		case Constants.BACKWARDS:
			if(newCordinateAddition[0] > 0)
				currentX = currentX -1;
			
			
			if(newCordinateAddition[1] > 0) 
				currentY = currentY -1;
		
		case Constants.FORWARD:
			
			if(newCordinateAddition[0] > 0)
				currentX = currentX + 1;
			
			
			if(newCordinateAddition[1] > 0) 
				currentY = currentY + 1;
		
		default:

		}

		return currentX+","+currentY;

	}
	
	private static int[] manageCordinates(String currentDirection) {
		
		final int cordinates[] = new int[2];
		
		switch (currentDirection) {
		case Constants.NORTH:
			cordinates[0] = 0;
			cordinates[1] = 1;
			
		case Constants.SOUTH:
			cordinates[0] = 0;
			cordinates[1] = 1;
			
		case Constants.EAST:
			cordinates[0] = 1;
			cordinates[1] = 0;
			
		case Constants.WEST:
			cordinates[0] = 1;
			cordinates[1] = 0;
			
		default:
			cordinates[0] = 0;
			cordinates[1] = 0;
		}
		
		return cordinates;
		
		
	}
}
	


