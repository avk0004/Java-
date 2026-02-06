package cond;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double result = sc.nextDouble();
        boolean f = true;
        while (f) {
            System.out.print("Enter operator (+, -, *, /, %) or any other key to exit: ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter next number: ");
            double num = sc.nextDouble();
            
            switch (operator) {
                case '+':
                    result += num;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result -= num;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result *= num;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (num == 0) {
                        System.out.println("Error: Division by zero!");
                        break;
                    }
                    result /= num;
                    System.out.println("Result: " + result);
                    break;

                case '%':
                    if (num == 0) {
                        System.out.println("Error: Division by zero!");
                        break;
                    }
                    result %= num;
                    System.out.println("Result: " + result);
                    break;

                default:
                    System.out.println("Invalid operator. Calculator stopped.");
                    sc.close();
                    f = false;
                    return;   // exits main → stops loop
            }
        }
    }
}
