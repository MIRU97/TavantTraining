package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() 
	{
		Temperature t = new  Temperature();

		double output =t.ConvertToFarenheit(16);

		assertEquals(60.8,output);

		double output2 = t.ConvertToCelsius(60.8);

		assertEquals(16.0,output2);
	}

}
