package com.manning.junitbook.displayname;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test class showing the @DisplayName annotation.")
class DisplayNameTest {

    private SUT systemUnderTest = new SUT();

    @DisplayName("Our system under test says hello")
    @Test
    void testHello() {
        assertEquals("Hello", systemUnderTest.hello());
    }

    @DisplayName("😱")
    @Test
    void testTalking() {
        assertEquals("Hello, how are you?", systemUnderTest.talk());
    }

    @DisplayName("Good bye")
    @Test
    void testBye() {
        assertEquals("Bye", systemUnderTest.bye());
    }
}