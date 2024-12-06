import java.util.Scanner;  // Importing the Scanner class to take input from the user

public class TemperatureConverter {
    public static void main(String[] args) {

        // First have to Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // This Block of code will Display the menu and ask the user to choose a conversion type
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Declare a variable to store the user's choice
        int choice = 0;

        // Input validation: Check if the user enters either 1 or 2
        while (true) {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) {  // Check if the input is an integer
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break;  // If the input is valid, break out of the loop
                } else {
                    System.out.println("Invalid choice! Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();  // Clear the invalid input
            }
        }

        // Declare a variable to store the temperature input from the user
        double temperature = 0.0;

        // This is to Ask the user to enter the temperature
        System.out.print("Enter the temperature: ");

        // Input validation for the temperature value (ensure it's a valid double)
        while (true) {
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break;  // If the input is valid, break out of the loop
            } else {
                System.out.println("Invalid temperature! Please enter a valid number.");
                scanner.next();  // Clear the invalid input
            }
        }

        // Declare a variable to store the converted temperature
        double convertedTemperature = 0.0;

        // This block of code Performs the conversion based on the user's choice
        if (choice == 1) {  // Convert Celsius to Fahrenheit
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.\n", temperature, convertedTemperature);
        } else if (choice == 2) {  // Convert Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.\n", temperature, convertedTemperature);
        }

        // Finally line of Code Closes the scanner to prevent resource leak
        scanner.close();
    }
}
