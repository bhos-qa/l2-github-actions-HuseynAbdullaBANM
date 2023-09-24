package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    public void testFahrenheitToCelsius() {
        // Test converting freezing point of water in Fahrenheit to Celsius
        double result = TemperatureConverter.fahrenheitToCelsius(32.0);
        assertEquals(0.0, result, 0.01); // Allowing for a small error due to double precision

        // Test converting boiling point of water in Fahrenheit to Celsius
        result = TemperatureConverter.fahrenheitToCelsius(212.0);
        assertEquals(100.0, result, 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        // Test converting freezing point of water in Celsius to Fahrenheit
        double result = TemperatureConverter.celsiusToFahrenheit(0.0);
        assertEquals(32.0, result, 0.01);

        // Test converting boiling point of water in Celsius to Fahrenheit
        result = TemperatureConverter.celsiusToFahrenheit(100.0);
        assertEquals(212.0, result, 0.01);
    }
}
