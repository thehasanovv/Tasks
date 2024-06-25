package classtasks.findminvalueofarray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();

        int[] rn = new int[capacity];

        for (int i = 0; i < rn.length; i++)
            rn[i] = (int) Math.round(Math.random() * 100);

        int min = rn[0];
        for (int i = 0; i < rn.length; i++)
            if (min > rn[i]) min = rn[i];

        System.out.println("Array of random numbers: " + Arrays.toString(rn));
        System.out.println("Min number is: " + min);
    }
}
