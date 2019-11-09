package com.sisnema.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {
	calculadora c = new calculadora();
	@Test
	public void testOK() {
		assertEquals(7, c.soma(3, 4));
	}
	@Test
	public void testNOK() {
		assertNotEquals(9, c.soma(3, 4));
	}
}
