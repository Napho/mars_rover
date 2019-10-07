package com.awamo.marsroverkata.interview;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
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
	}
}
