package solutions.w3resource;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = in.nextInt();

        System.out.println("Input second number: ");
        int num2 = in.nextInt();

        // Addition
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        // Subtraction
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        // Multiplication
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        // Division
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        // Remainder
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
