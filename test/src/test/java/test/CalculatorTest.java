package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	int a, b;
	Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void testTopla() {
		a=13; b=1;
		assertEquals(14, calculator.topla(a, b));
	}

}
