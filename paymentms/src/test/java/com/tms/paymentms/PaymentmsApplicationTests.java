package com.tms.paymentms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tms.paymentms.Tests.TestSomething;

@SpringBootTest
class PaymentmsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    public void testGetGreeting() {
        TestSomething testSomething = new TestSomething();
        String greeting = testSomething.getGreeting();
        
        // Verify the greeting is correct
        assertEquals("Hello, payment Test!", greeting);
    }

}
