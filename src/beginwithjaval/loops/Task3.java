package beginwithjaval.loops;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.printf("%d x %d = %d\n", num, i, (num * i));
    }
}
