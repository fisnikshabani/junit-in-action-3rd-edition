package com.manning.junitbook.categories;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.manning.junitbook.tags.Customer;
import com.manning.junitbook.tags.CustomersRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({IndividualTests.class, RepositoryTests.class})
public class JUnit4CustomersRepositoryTest {

    private String CUSTOMER_NAME = "John Smith";
    private CustomersRepository repository = new CustomersRepository();

    @Test
    public void testNonExistence() {
        boolean exists = repository.contains(CUSTOMER_NAME);

        assertFalse(exists);
    }

    @Test
    public void testCustomerPersistence() {
        repository.persist(new Customer(CUSTOMER_NAME));

        assertTrue(repository.contains("John Smith"));
    }
}
