package solutions.w3resource;

import java.util.ArrayList;
import java.util.List;

public class Task50 {
    public static void main(String[] args) {
        List<Integer> dividedBy3 = new ArrayList<>();
        List<Integer> dividedBy5 = new ArrayList<>();
        List<Integer> dividedBy3And5 = new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                dividedBy3.add(i);
            if (i % 5 == 0)
                dividedBy5.add(i);
            if (i % 3 == 0 && i % 5 == 0)
                dividedBy3And5.add(i);
        }

        printTheResult(dividedBy3, "3");
        printTheResult(dividedBy5, "5");
        printTheResult(dividedBy3And5, "3 & 5");
    }

    public static void printTheResult(List<Integer> arr, String divided) {
        System.out.printf("Divided by %s:\n", divided);
        System.out.println(arr.toString().substring(1, arr.toString().length() - 1) + "\n");
    }
}
