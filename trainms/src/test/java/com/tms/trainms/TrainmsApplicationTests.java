package com.tms.trainms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tms.trainms.TestSomething.TestSomething;

@SpringBootTest
class TrainmsApplicationTests {

	@Test
	void contextLoads() {
        String message = "Train Microservice Test";
	}

	@Test
    public void testGetGreeting() {
        TestSomething testSomething = new TestSomething();
        String greeting = testSomething.getGreeting();
        
        // Verify the greeting is correct
        assertEquals("Hello, Train!", greeting);
    }

}
