package w3resource;

import java.util.Scanner;

public class Task54NF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Input the first number: ");
        int x = sc.nextInt();

        // Prompt the user to input the second number
        System.out.print("Input the second number: ");
        int y = sc.nextInt();

        // Prompt the user to input the third number
        System.out.print("Input the third number: ");
        int z = sc.nextInt();

        System.out.print("The result is: " + test_last_digit(x, y, z));
    }

    public static boolean test_last_digit(int p, int q, int r) {
        return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    }
}
