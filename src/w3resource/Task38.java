package w3resource;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input a string and read the input string
        System.out.print("Input a string: ");
        String input = sc.nextLine();
        sc.close();

        // Call the countAndPrint method to analyze the characters in the input string
        countAndPrint(input);

    }

    public static void countAndPrint(String str) {
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(charArray[i]))
                letter++;
            else if (Character.isSpaceChar(charArray[i]))
                space++;
            else if (Character.isDigit(charArray[i]))
                number++;
            else
                other++;
        }

        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }
}
