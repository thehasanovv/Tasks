package solutions.w3resource;

import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int x = sc.nextInt();

        System.out.print("Input the second number: ");
        int y = sc.nextInt();

        System.out.print("Input the third number : ");
        int z = sc.nextInt();

        // Calculate and print the result of the condition
        calculateAndPrint(x, y, z);

    }

    public static void calculateAndPrint(int x, int y, int z) {
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
    }
}
