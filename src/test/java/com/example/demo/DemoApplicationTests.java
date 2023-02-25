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
	
	@Test
	void testC() {
		System.out.println("Test C solo");
		Assertions.assertEquals(1, 1);
	}
	
	@Test
	void testD() {
		System.out.println("Test D auto con el script?");
		Assertions.assertEquals(1, 1);
	}

}
