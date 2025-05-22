package com.manning.junitbook.assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertThrowsTest {

    private SUT systemUnderTest = new SUT("Our system under test");

    @Test
    @DisplayName("An exception is expected")
    void testExpectedException() {
        assertThrows(NoJobException.class, systemUnderTest::run);
    }

    @Test
    @DisplayName("An exception is cought")
    void testCatchException() {
        Throwable throwable = assertThrows(NoJobException.class, () -> systemUnderTest.run(1000));
        assertEquals("No job on the execution list", throwable.getMessage());
    }

}