package solutions.w3resource;

import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int a = sc.nextInt();

        System.out.print("Input the second number: ");
        int b = sc.nextInt();

        int reminder = a - (a / b * b);

        System.out.println(reminder);
    }
}
