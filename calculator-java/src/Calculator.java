import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // double num1 = 10;
        // double num2 = 5;

        // System.out.println("Addition: " + MathUtils.add(num1, num2));
        // System.out.println("Subtraction: " + MathUtils.subtract(num1, num2));
        // System.out.println("Multiplication: " + MathUtils.multiply(num1, num2));
        // System.out.println("Division: " + MathUtils.divide(num1, num2));

        Calculator demo = new Calculator();

        int signInput = 1; 
        double firstNumberInput;
        double secondNumberInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the TIL Calculator!");
       while (signInput != 0) {
        
        demo.printMenu();
        System.out.print("Enter which you want:");
        signInput = scanner.nextInt();
        
        if (signInput == 0) {
            System.out.println("Goodbye!");
            return;
        }  else{

            System.out.print("Enter first number:");
            firstNumberInput = scanner.nextDouble();
            System.out.print("Enter second number:");
            secondNumberInput = scanner.nextDouble();
            switch (signInput) {
                case 1:
                    System.out.println("Addition: " + MathUtils.add(firstNumberInput, secondNumberInput));
                    break;
                case 2:
                    System.out.println("Result: " + MathUtils.subtract(firstNumberInput, secondNumberInput));
                    break;
                case 3:
                    System.out.println("Result: " + MathUtils.multiply(firstNumberInput, secondNumberInput));
                    break;
                case 4:
                   
                    System.out.println("Result: " + MathUtils.divide(firstNumberInput, secondNumberInput));
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
        }
       }
    }

     public void printMenu() {
        System.out.println("1. Sum");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
    }
}