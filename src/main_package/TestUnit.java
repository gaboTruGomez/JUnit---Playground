package main_package;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TestUnit {
	
	OperationsClass opClass = new OperationsClass();
	
	@Test
	public void addOne() {
		int expectedResult = 5;
		assertEquals(expectedResult, opClass.addOne(4), "Sum of 4 + 1 should be 5.");
	}
	
	@Test
	public void testGetMax() {
		int a = 4;
		int b = 5;
		int expectedResult = 5; // 5 > 4
		assertEquals(expectedResult, opClass.returnMax(a, b), "5 is bigger than 4.");

	}
}
