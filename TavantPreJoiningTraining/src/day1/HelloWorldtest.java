package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		HelloWorld g=new HelloWorld();
		String out = g.getMessage();
		assertEquals("HelloWorld",out);
	}

}
