package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGetPersonJson() {
        String result = App.getPersonJson(new Person("Erling", "Haaland", 23));
        String expected = "{\n  \"name\": \"Erling\",\n  \"lastName\": \"Haaland\",\n  \"age\": 23\n}";
        assertEquals(expected, result);
    }

    @Test
    void testGetEmptyPersonJson() {
        String result = App.getPersonJson(new Person());
        String expected = "{\n  \"age\": 0\n}";
        assertEquals(expected, result);
    }
}