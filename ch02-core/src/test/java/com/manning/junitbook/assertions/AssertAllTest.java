package com.manning.junitbook.assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertAllTest {

    @Test
    @DisplayName("SUT should default to not being under current verification")
    void testSystemNotVerified() {

        SUT systemUnderTest = new SUT("Our system under test");

        assertAll("By default, SUT is not under current verification",
            () -> assertEquals("Our system under test", systemUnderTest.getSystemName()),
            () -> assertFalse(systemUnderTest.isVerified())
        );
    }

    @Test
    @DisplayName("SUT should be under current verification")
    void testSystemUnderVerification() {
        SUT systemUnderTest = new SUT("Our system under test");
        systemUnderTest.verify();

        assertAll("SUT should be under current verification",
            () -> assertEquals("Our system under test", systemUnderTest.getSystemName()),
            () -> assertTrue(systemUnderTest.isVerified())
        );
    }
}
