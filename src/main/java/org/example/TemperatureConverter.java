package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1/2): ");
        int option = scanner.nextInt();

        double temperature;
        if (option == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius");
        } else if (option == 2) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit");
        } else {
            System.out.println("Invalid option. Please choose 1 or 2.");
        }

        scanner.close();
    }
}
