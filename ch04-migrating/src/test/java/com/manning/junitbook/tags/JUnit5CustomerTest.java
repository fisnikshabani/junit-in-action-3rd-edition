package com.manning.junitbook.tags;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("individual")
public class JUnit5CustomerTest {

    private String CUSTOMER_NAME = "John Smith";

    @Test
    void testCustomer() {
        Customer customer = new Customer(CUSTOMER_NAME);
        assertEquals("John Smith", customer.getName());
    }
}
