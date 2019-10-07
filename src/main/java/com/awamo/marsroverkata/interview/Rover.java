package com.awamo.marsroverkata.interview;

import java.rmi.activation.UnknownObjectException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.awamo.marsroverkata.interview.exceptions.UnknownDirectionException;
import com.awamo.marsroverkata.interview.utils.Constants;
import com.awamo.marsroverkata.interview.utils.Helpers;

/**
 * The Rover class holds state objects and command methods of Rover navigation
 * 
 * @author naphlin
 *
 */
@Component
public class Rover {

	private String state = "0,0,N";
	private final int Y_INDEX = 1;
	private final int X_INDEX = 0;
	private final int DIRECTION_INDEX = 2;

	private static final String[] COMMANDS = { "L", "R", "F", "B" };
	private static final String COMMAND_SEPARATOR = ",";

	public String executeCommand(String commands) {

		checkDirectionCommandIsValid(commands);

		String[] commandArray = commands.split(COMMAND_SEPARATOR);

		for (String command : commandArray) {
			String[] currentState = state.split(",");
			String direction = currentState[DIRECTION_INDEX];
			
			if(!(command.equals(Constants.BACKWARDS) || command.equals(Constants.FORWARD))) {
				direction = Helpers.getNewDirection(currentState[DIRECTION_INDEX], command);
			}
			
			String cordinates = Helpers.getNewCordinates(Integer.valueOf(currentState[X_INDEX]),
					Integer.valueOf(currentState[Y_INDEX]), direction, command);

			state = cordinates + "," + direction;
		}

		return state;

	}

	private void checkDirectionCommandIsValid(String command) {

		final List<String> commands = Arrays.asList(COMMANDS);

		if (!Arrays.stream(command.split(COMMAND_SEPARATOR)).anyMatch(comm -> commands.contains(comm)))
			throw new UnknownDirectionException(command);

	}

}
