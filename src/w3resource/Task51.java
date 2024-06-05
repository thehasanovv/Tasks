package w3resource;

import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.nextLine();

        sc.close();

        int numInt = Integer.parseInt(numStr);

        System.out.printf("Input a number(string): %s\n", numStr);
        System.out.printf("The integer value is: %d", numInt);
    }
}
