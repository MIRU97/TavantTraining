package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNosTest {

	@Test
	void test() 
	{
		SumOfNos s =new SumOfNos();

		int output = s.SumOfEvenNos(20, 30);

		assertEquals(150,output);

		int output2 = s.SumOfOddNos(20, 30);

		assertEquals(125,output2);
	}

}
