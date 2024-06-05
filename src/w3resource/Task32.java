package w3resource;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first integer: ");
        int num1 = sc.nextInt();

        System.out.println("Input second integer: ");
        int num2 = sc.nextInt();

        compare(num1, num2);
    }
    public static void compare(int num1, int num2) {
        if (num1 == num2)
            printMessage(num1, num2, "==");

        if (num1 != num2)
            printMessage(num1, num2, "!=");

        if (num1 < num2)
            printMessage(num1, num2, "<");

        if (num1 > num2)
            printMessage(num1, num2, ">");

        if (num1 <= num2)
            printMessage(num1, num2, "<=");

        if (num1 >= num2)
            printMessage(num1, num2, ">=");
    }
    public static void printMessage(int num1, int num2, String o) {
        System.out.printf("%d %s %d\n", num1, o, num2);
    }
}
