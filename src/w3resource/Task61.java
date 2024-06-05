package w3resource;

import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read a word from the user
        System.out.print("Input a word: ");
        String str = sc.next();
        sc.close();

        ///////////////////////////////////////////////////////////
        // Solution 1
        StringBuilder reversedStr = new StringBuilder();
        reversedStr.append(str).reverse();

        System.out.println(reversedStr);

        ///////////////////////////////////////////////////////////
        // Solution 2
        String reversedStr2 = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reversedStr2 = ch + reversedStr2;
        }

        System.out.println(reversedStr2);
    }
}
