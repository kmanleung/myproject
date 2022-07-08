package com.myproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CeilingFanTest {

	@Test
	public void testCeilingFan() {
		
		CeilingFan ceilingFan = new CeilingFan();
		
		//Test Constructor, expected result : speed = 0; reverse (direction) = false
		assertEquals("Failure - fan speed is not 0 (off)", ceilingFan.getSpeed(), 0);
		assertEquals("Failure - fan direction is not non-reverse", ceilingFan.getReverse(), false);
		
		//Test pull speed cord, expected result : speed = 1, reverse = false
		ceilingFan.pullSpeedCord();
		assertEquals("Failure - fan speed is not 1", ceilingFan.getSpeed(), 1);
		assertEquals("Failure - fan direction is not non-reverse", ceilingFan.getReverse(), false);
		
		//Test pull speed cord, expected result : speed = 2, reverse = false
		ceilingFan.pullSpeedCord();
		assertEquals("Failure - fan speed is not 2", ceilingFan.getSpeed(), 2);
		assertEquals("Failure - fan direction is not non-reverse", ceilingFan.getReverse(), false);
		
		//Test pull speed cord, expected result : speed = 3, reverse = false
		ceilingFan.pullSpeedCord();
		assertEquals("Failure - fan speed is not 3", ceilingFan.getSpeed(), 3);
		assertEquals("Failure - fan direction is not non-reverse", ceilingFan.getReverse(), false);
		
		//Test pull speed cord, expected result : speed = 0, reverse = false
		ceilingFan.pullSpeedCord();
		assertEquals("Failure - fan speed is not 0 (off)", ceilingFan.getSpeed(), 0);
		assertEquals("Failure - fan direction is not non-reverse", ceilingFan.getReverse(), false);
		
		//Test pull reverse (direction) cord, expected result : speed = 0, reverse = true
		ceilingFan.pullReverseCord();
		assertEquals("Failure - fan speed is not 0 (off)", ceilingFan.getSpeed(), 0);
		assertEquals("Failure - fan direction is not reverse", ceilingFan.getReverse(), true);
		
		//Test pull speed cord, expected result : speed = 1, reverse = true
		ceilingFan.pullSpeedCord();
		assertEquals("Failure - fan speed is not 1", ceilingFan.getSpeed(), 1);
		assertEquals("Failure - fan direction is not reverse", ceilingFan.getReverse(), true);
		
		//Test pull speed cord, expected result : speed = 2, reverse = true
		ceilingFan.pullSpeedCord();
		assertEquals("Failure - fan speed is not 2", ceilingFan.getSpeed(), 2);
		assertEquals("Failure - fan direction is not reverse", ceilingFan.getReverse(), true);
		
		//Test pull speed cord, expected result : speed = 3, reverse = true
		ceilingFan.pullSpeedCord();
		assertEquals("Failure - fan speed is not 3", ceilingFan.getSpeed(), 3);
		assertEquals("Failure - fan direction is not reverse", ceilingFan.getReverse(), true);
		
		//Test pull reverse (direction) cord, expected result : speed = 3, reverse = false
		ceilingFan.pullReverseCord();
		assertEquals("Failure - fan speed is not 3", ceilingFan.getSpeed(), 3);
		assertEquals("Failure - fan direction is not non-reverse", ceilingFan.getReverse(), false);
				
	}
	

	

}
