package w3resource;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int ch;

        System.out.println("Input a char: ");
        String input = sc.next();
        sc.close();

        while (input.length() != 1) {
            System.out.println("Please add a char value");
            input = sc.next();
        }

        ch = input.charAt(0);
        System.out.println("The ASCII value of Z is: " + ch);
    }
}
