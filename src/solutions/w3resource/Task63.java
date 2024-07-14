package solutions.w3resource;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Input the first number : ");
        int x = sc.nextInt();  // Read and store the first number

        // Prompt the user to input the second number
        System.out.print("Input the second number: ");
        int y = sc.nextInt();  // Read and store the second number

        // Call the result method with the two numbers and print the result
        System.out.println("Result: " + compare(x, y));
    }

    public static int compare(int x, int y) {
        if (x == y) return 0;
        if (x % 6 == y % 6) return (x < y) ? x : y;

        return (x > y) ? x : y;
    }
}
