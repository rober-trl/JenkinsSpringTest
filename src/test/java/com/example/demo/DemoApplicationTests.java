package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void testA() {
		Assertions.assertEquals(2, 2);
	}
	
	@Test
	void testB() {
		System.out.println("Test B");
		Assertions.assertEquals(1, 1);
	}

}
