package w3resource;

import java.util.Scanner;

public class Task49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = sc.nextInt();
        sc.close();

        int result = checkWhetherTheNumberIsEvenOrNot(num);

        System.out.println(result);
    }

    public static int checkWhetherTheNumberIsEvenOrNot(int num) {
        return num % 2 == 0 ? 1 : 0;
    }
}
