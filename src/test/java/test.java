package com.example.myproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testGreetCorrectInput() {
        Person person = new Person();
        assertEquals("Hello, Ram!", person.greet("ram", 3025));
    }

    @Test
    public void testGreetIncorrectInput() {
        Person person = new Person();
        assertEquals("Invalid input!", person.greet("john", 1234));
    }
}
