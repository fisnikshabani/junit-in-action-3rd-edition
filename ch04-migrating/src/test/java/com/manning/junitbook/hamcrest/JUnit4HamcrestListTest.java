package com.manning.junitbook.hamcrest;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class JUnit4HamcrestListTest {

    private List<String> values;

    @Before
    public void setUp() {
        values = new ArrayList<>();
        values.add("one");
        values.add("two");
        values.add("three");
    }

    @Test
    public void testListWithHamcrest() {
        assertThat(values, hasSize(3));
        assertThat(values, hasItem(anyOf(equalTo("one"), equalTo("two"), equalTo("three"))));
        assertThat("The list doesn't contain all the expected objects, in order", values, contains("one", "two", "three"));
        assertThat("The list doesn't contain all the expected objects", values, containsInAnyOrder("one", "three", "two"));
    }
}
