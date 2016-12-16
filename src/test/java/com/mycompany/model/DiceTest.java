package com.mycompany.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DiceTest {
	
	@Test
	public void testRoll() {
		
		Dice d6dice = new Dice(6);
		int rollValue = d6dice.roll(2);
		
		System.out.println("The testRoll junit test rolled with 2d6: " + rollValue);
		
		assertTrue(rollValue <= 12);
		assertTrue(rollValue > 0);
	}
	
	@Test
	public void testRoll2() {
		
		Dice d6dice = new Dice(1);
		int rollValue = d6dice.roll(1);
		
		System.out.println("The testRoll junit test rolled with 1d1: " + rollValue);
		
		assertTrue(rollValue == 1);
	}
}
