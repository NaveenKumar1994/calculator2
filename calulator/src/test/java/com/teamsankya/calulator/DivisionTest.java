package com.teamsankya.calulator;

import org.junit.Test;
import junit.framework.TestCase;

public class DivisionTest {

	@Test
	public void testDiv() {
		double res = Division.div(1, 1);
		TestCase.assertEquals(2, res);
	}

}
