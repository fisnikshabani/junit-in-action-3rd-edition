package com.manning.junitbook.categories;

import static org.junit.Assert.assertEquals;

import com.manning.junitbook.tags.Customer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class JUnit4CustomerTest {

    private String CUSTOMER_NAME = "John Smith";

    @Category(IndividualTests.class)
    @Test
    public void testCustomer() {
        Customer customer = new Customer(CUSTOMER_NAME);

        assertEquals("John Smith", CUSTOMER_NAME);
    }
}
