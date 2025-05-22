package com.manning.junitbook.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("repository")
class CustomersRepositoryTest {

    private String CUSTOMER_NAME = "John Smith";

    private CustomersRepository customersRepository = new CustomersRepository();

    @Test
    void  testNonExistence() {
        boolean exists = customersRepository.contains("John Smith");
        assertFalse(exists);
    }

    @Test
    void testCustomerPersistence() {
        customersRepository.persist(new Customer(CUSTOMER_NAME));
        assertTrue(customersRepository.contains("John Smith"));
    }
}