package solutions.beginwithjaval.loops;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int result = 1;

        sc.close();

        for (int i = 0; i < pow; i++) {
            result *= num;
        }

        System.out.println(result);

    }
}
