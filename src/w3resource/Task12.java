package w3resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        List<Integer> inputsNumber = getInputsNumber();

        double avr = getAverageNumber(inputsNumber);
        System.out.println(avr);
    }

    public static List<Integer> getInputsNumber() {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();

        System.out.println("Input first number: ");
        nums.add(sc.nextInt());

        System.out.println("Input second number: ");
        nums.add(sc.nextInt());

        System.out.println("Input third number: ");
        nums.add(sc.nextInt());

        return nums;
    }

    public static double getAverageNumber(List<Integer> nums) {
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }
}
