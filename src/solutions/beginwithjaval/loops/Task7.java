package solutions.beginwithjaval.loops;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;

        // Prompt the user to input the size of array
        System.out.println("How many numbers do you want add?");
        int num = sc.nextInt();
        int[] setOfIntegers = new int[num];


        System.out.println("Now, please add numbers");
        for (int i = 0; i < num; i++)
            setOfIntegers[i] = sc.nextInt();

        for (int i = 1; i <= setOfIntegers.length; i++) {
            if (i % 2 == 0)
                sumEvenNumbers += i;
            else if (i % 2 != 0)
                sumOddNumbers += i;
        }

        System.out.println("Sum of even numbers: " + sumEvenNumbers);
        System.out.println("Sum of odd numbers: " + sumOddNumbers);
        sc.close();
    }
}
