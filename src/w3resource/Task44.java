package w3resource;

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.printf("%d + %d%d + %d%d%d", num, num, num, num, num, num);
    }
}
