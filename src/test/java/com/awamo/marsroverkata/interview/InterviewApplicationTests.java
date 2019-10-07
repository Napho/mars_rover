package com.awamo.marsroverkata.interview;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InterviewApplicationTests {

	private Rover rover;
	
	@Before
	public void init() {
		rover = new Rover();
	}
	
	
	@Test
	public void contextLoads() {
	}

	
	@Test
	public void turnRoverLeft() {
		
		assertThat(rover.executeCommand("L"),CoreMatchers.equalTo("0,0,W"));
		assertThat(rover.executeCommand("LL"),CoreMatchers.equalTo("0,0,E"));
		assertThat(rover.executeCommand("LLL"),CoreMatchers.equalTo("0,0,S"));
		assertThat(rover.executeCommand("L"),CoreMatchers.equalTo("0,0,E"));
			
	}
	
	
	@Test
	public void turnRoverRight() {
		
		assertThat(rover.executeCommand("R"),CoreMatchers.equalTo("0,0,E"));
		assertThat(rover.executeCommand("RR"),CoreMatchers.equalTo("0,0,W"));
		assertThat(rover.executeCommand("RRR"),CoreMatchers.equalTo("0,0,S"));
		assertThat(rover.executeCommand("R"),CoreMatchers.equalTo("0,0,W"));
			
	}
	
	
	@Test
	public void moveRoverForward() {
		
		assertThat(rover.executeCommand("F"),CoreMatchers.equalTo("0,1,N"));
		assertThat(rover.executeCommand("FF"),CoreMatchers.equalTo("0,3,N"));
		assertThat(rover.executeCommand("LFF"),CoreMatchers.equalTo("-2,3,W"));
		assertThat(rover.executeCommand("RFF"),CoreMatchers.equalTo("-2,5,N"));
			
	}
	
	
	@Test
	public void moveRoverBack() {
		
		assertThat(rover.executeCommand("LB"),CoreMatchers.equalTo("-1,0,W"));
		assertThat(rover.executeCommand("LBB"),CoreMatchers.equalTo("-1,2,S"));
		assertThat(rover.executeCommand("BBR"),CoreMatchers.equalTo("-1,4,W"));
		assertThat(rover.executeCommand("FFFB"),CoreMatchers.equalTo("-3,4,W"));
			
	}
		
	
}
