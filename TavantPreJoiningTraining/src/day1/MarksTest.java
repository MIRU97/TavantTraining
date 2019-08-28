package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void test()
	{
		MarkValidator out = new MarkValidator();
		
		String output = out.IsPass(80);

		assertEquals("Pass",output);

		String output2 = out.MarkGrade(80);

		assertEquals("Grade B",output2);
	}

}
