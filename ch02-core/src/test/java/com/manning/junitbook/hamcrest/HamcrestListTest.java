package com.manning.junitbook.hamcrest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HamcrestListTest {

    private List<String> values;

    @BeforeEach
    public void setUp() {
        values = new ArrayList<>();
        values.add("John");
        values.add("Michael");
        values.add("Edwin");
    }

    @Test
    @DisplayName("List without Hamcrest")
    public void testListWithoutHamcrest() {
        assertEquals(3, values.size());
        assertTrue(values.contains("John") || values.contains("Michael") || values.contains("Edwin"));
    }

    @Test
    @DisplayName("List with Hamcrest")
    public void testListWithHamcrest() {
        assertThat(values, hasSize(3));
        assertThat(values, hasItem(anyOf(equalTo("John"), equalTo("Michael"),
                equalTo("Edwin"))));
        assertThat("The list contains all the expected objects, in order", values, contains("John", "Michael", "Edwin"));
        assertThat("The list contains all the expected objects", values, containsInAnyOrder("Michael", "Edwin", "John"));
    }
}
