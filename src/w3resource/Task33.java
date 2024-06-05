package w3resource;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input an integer
        System.out.print("Input an integer: ");
        long num = sc.nextLong();

        // Calculate and display the sum of the digits
        System.out.println("The sum of the digits is: " + sumDigits(num));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        return sum;
    }
}
