package w3resource;

import java.util.Scanner;

public class Task57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        int factorCount = countFactors(num);
        System.out.println(factorCount);
    }

    public static int countFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
