package TemperatureConverter;

import java.util.Scanner;

public class temperatureconverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        double temperature;
        double convertedTemperature;

        System.out.println(" TEMPERATURE CONVERTER ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Choose a conversion: ");
        choice = input.nextInt();

        if (choice == 1) {

            System.out.print("Enter temperature in Celsius: ");
            temperature = input.nextDouble();

            convertedTemperature = (temperature * 9 / 5) + 32;

            System.out.println("Temperature in Fahrenheit: "
                    + convertedTemperature + "°F");

        } else if (choice == 2) {

            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = input.nextDouble();

            convertedTemperature = (temperature - 32) * 5 / 9;

            System.out.println("Temperature in Celsius: "
                    + convertedTemperature + "°C");

        } else {

            System.out.println("Invalid choice.");

        }

        input.close();
    }
}