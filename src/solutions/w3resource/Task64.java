package solutions.w3resource;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add two integer between 25 and 75");
        System.out.print("Input the first number : ");
        int x = sc.nextInt();

        System.out.print("Input the second number: ");
        int y = sc.nextInt();

        if (isValidRange(x) && isValidRange(y)) {
            System.out.printf("Result %b", hasCommonDigit(x, y));
        } else {
            System.out.println("Invalid input values. Both values must be between 25 and 75.");
        }
    }

    public static boolean isValidRange(int num) {
        return num >= 25 && num <= 75;
    }

    public static boolean hasCommonDigit(int x, int y) {
        String strX = String.valueOf(x);
        String strY = String.valueOf(y);

        for (char c : strX.toCharArray()) {
            if (strY.contains(String.valueOf(c)))
                return true;
            else
                return false;
        }
        return false;
    }
}
