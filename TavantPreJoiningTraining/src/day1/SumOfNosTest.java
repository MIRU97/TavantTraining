package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test() 
	{
		SumOfNumbers scanner =new SumOfNumbers();

		int output = scanner.SumOfEvenNumbers(20, 30);

		assertEquals(150,output);

		int output2 = scanner.SumOfOddNumbers(20, 30);

		assertEquals(125,output2);
	}

}
