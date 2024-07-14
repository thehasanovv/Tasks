package solutions.w3resource;

import java.util.*;

public class Task53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int a = sc.nextInt();

        System.out.print("Input the second number: ");
        int b = sc.nextInt();

        System.out.print("Input the third number: ");
        int c = sc.nextInt();

        System.out.print("Input a boolean value (true/false): ");
        boolean abc = sc.nextBoolean();

        sc.close();

        System.out.print("The result is: " + test(a, b, c, abc));

    }

    public static boolean test(int a, int b, int c, boolean abc) {
        if (abc)
            return (c > b);
        return (b > a && c > b);
    }
}
