package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
		//assertEquals(-1,new AddServices().addServices(-1,-9));
		assertTrue("your fail message ",0 > new AddServices().addServices(-1,-9));
	}

}
