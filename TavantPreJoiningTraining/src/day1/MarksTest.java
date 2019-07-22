package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksTest {

	@Test
	void test()
	{
		Marks m = new Marks();
		
		String output = m.IsPass(80);

		assertEquals("Pass",output);

		String output2 = m.MarkGrade(80);

		assertEquals("Grade B",output2);
	}

}
