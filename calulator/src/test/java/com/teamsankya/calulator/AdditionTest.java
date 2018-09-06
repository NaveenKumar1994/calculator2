package com.teamsankya.calulator;

import org.junit.Test;

import junit.framework.TestCase;

public class AdditionTest {

	@Test
	public void testAddInt() {
		int sum = Addition.add(20, 30);
		TestCase.assertEquals(40, sum);
	}
}
