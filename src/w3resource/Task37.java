package w3resource;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input a string and read the input string
        System.out.print("Input a string: ");

        // Read a word from the user
        String input = sc.nextLine();
        sc.close();

        // Print reversed string
        System.out.println(getReversedString(input));
    }
    public static String getReversedString(String str) {
        String reversedStr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reversedStr = ch + reversedStr;
        }
        return reversedStr;
    }
}
