package com.tms.bookingms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tms.bookingms.TestSomething.TestSomething;

@SpringBootTest
class BookingmsApplicationTests {

	@Test
	void contextLoads() {
		
	}

	@Test
	void testSomething() {
		TestSomething testSomething = new TestSomething();
		assertEquals("Hello, Bookingms!", testSomething.getGreeting());
	}

	@Test 
	void testAddingNewTest() {
		TestSomething testSomething = new TestSomething();
		assertEquals("Adding new test", testSomething.addingNewTest());
	}
}
