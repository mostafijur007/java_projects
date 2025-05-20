import java.util.Scanner;
import utils.MathUtils;

public class Calculator {
    public static void main(String[] args) {

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
                    if (secondNumberInput == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Division: " + MathUtils.divide(firstNumberInput, secondNumberInput));
                    }
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