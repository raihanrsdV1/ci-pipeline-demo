package com.example.userms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.userms.TestSomething.TestSomething;

@SpringBootTest
class UsermsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testSomething() {
		TestSomething testSomething = new TestSomething();
		assertEquals("Hello, userms!", testSomething.getGreeting());
	}

	@Test 
	void testAddingNewTest() {
		TestSomething testSomething = new TestSomething();
		assertEquals("Adding new test", testSomething.addingNewTest());
	}

}
