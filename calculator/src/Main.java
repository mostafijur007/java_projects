import java.util.InputMismatchException;
import java.util.Scanner;

import utils.MathUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int signInput = -1;
        double firstNumberInput = 0;
        double secondNumberInput = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the TIL Calculator!");

        while (signInput != 0) {
            printMenu();

            // Validate menu choice
            System.out.print("Enter the operation number: ");
            try {
                signInput = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number from 0 to 4.");
                scanner.nextLine(); // Clear the invalid input
                continue;
            }

            if (signInput == 0) {
                System.out.println("Goodbye!");
                break;
            }

            if (signInput < 1 || signInput > 4) {
                System.out.println("Invalid operation. Please choose between 1 and 4.");
                continue;
            }

            // Validate first number
            System.out.print("Enter first number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input
                continue;
            }
            firstNumberInput = scanner.nextDouble();

            // Validate second number
            System.out.print("Enter second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input
                continue;
            }
            secondNumberInput = scanner.nextDouble();

            switch (signInput) {
                case 1:
                    System.out.println("Result: " + MathUtils.add(firstNumberInput, secondNumberInput));
                    break;
                case 2:
                    System.out.println("Result: " + MathUtils.subtract(firstNumberInput, secondNumberInput));
                    break;
                case 3:
                    System.out.println("Result: " + MathUtils.multiply(firstNumberInput, secondNumberInput));
                    break;
                case 4:
                    if (secondNumberInput == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + MathUtils.divide(firstNumberInput, secondNumberInput));
                    }
                    break;
            }
        }

        scanner.close();
    }

    public static void printMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Sum");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
    }
}