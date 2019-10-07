package com.awamo.marsroverkata.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.awamo.marsroverkata.interview.Rover;

@RestController
public class RoverController {
	
	
	@Autowired
	private Rover rover;
	
	public RoverController() {
		
	}
	
	@GetMapping("/rover/move/{commmands}")
	private String moveRover(@PathVariable String commands) {
		
		return rover.executeCommand(commands);
		
	}

}
