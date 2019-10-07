package com.awamo.marsroverkata.interview;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Tests for Rover commands
 * @author naphlin
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InterviewApplicationTests {
	
	@Test
	public void contextLoads() {
	}

	
	@Test
	public void turnRoverLeft() {
	    
		Rover rover = new Rover();
		
		assertThat(rover.executeCommand("L"),CoreMatchers.equalTo("0,0,W"));
		assertThat(rover.executeCommand("L,L"),CoreMatchers.equalTo("0,0,E"));
		assertThat(rover.executeCommand("L,L,L"),CoreMatchers.equalTo("0,0,S"));
		assertThat(rover.executeCommand("L"),CoreMatchers.equalTo("0,0,E"));
			
	}
	
	
	@Test
	public void turnRoverRight() {
		
		Rover rover = new Rover();
		
		assertThat(rover.executeCommand("R"),CoreMatchers.equalTo("0,0,E"));
		assertThat(rover.executeCommand("R,R"),CoreMatchers.equalTo("0,0,W"));
		assertThat(rover.executeCommand("R,R,R"),CoreMatchers.equalTo("0,0,S"));
		assertThat(rover.executeCommand("R"),CoreMatchers.equalTo("0,0,W"));
			
	}
	
	
	@Test
	public void moveRoverForward() {
		
		Rover rover = new Rover();
		
		assertThat(rover.executeCommand("F"),CoreMatchers.equalTo("0,1,N"));
		assertThat(rover.executeCommand("F,F"),CoreMatchers.equalTo("0,3,N"));
		assertThat(rover.executeCommand("L,F,F"),CoreMatchers.equalTo("-2,3,W"));
		assertThat(rover.executeCommand("R,F,F"),CoreMatchers.equalTo("-2,5,N"));
			
	}
	
	
	@Test
	public void moveRoverBack() {
		
		Rover rover = new Rover();
		
		assertThat(rover.executeCommand("L,B"),CoreMatchers.equalTo("1,0,W"));
		assertThat(rover.executeCommand("L,B,B"),CoreMatchers.equalTo("1,-2,S"));
		assertThat(rover.executeCommand("B,B,R"),CoreMatchers.equalTo("1,-4,W"));
		assertThat(rover.executeCommand("F,F,F,B"),CoreMatchers.equalTo("-1,-4,W"));
			
	}
	
	
		
	
}
