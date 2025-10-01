package org.example;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsoleRegexInputTest {
    @Test
    public void testValidInput() {
        String input = "John";
        Scanner scanner = new Scanner(input);
        String result = ConsoleRegexInput.getInput(scanner, "Enter name", "^[A-Za-z]+$", "Invalid name");
        assertEquals("John", result);
    }

    @Test
    public void testInvalidInputThenValidInput() {
        String input = "Inv@l!d\nValid";
        Scanner scanner = new Scanner(input);
        String result = ConsoleRegexInput.getInput(scanner, "Enter name", "^[A-Za-z]+$", "Invalid name");
        assertEquals("Valid", result);
    }
}