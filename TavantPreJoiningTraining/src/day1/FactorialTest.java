package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() 
	{
		Factorial x = new Factorial();

		int output = x.CalculateFactorial(4);

		assertEquals(24,output);
	}

}
