package w3resource;/* Write a Java program to find the penultimate (next to the last) word in a sentence.
Sample Output:

Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy */

import java.util.Scanner;

public class Task60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Sentence: ");
        String str = sc.nextLine();
        sc.close();

        String[] strArr = str.split(" ");
        System.out.println(strArr[strArr.length - 2]);
    }
}
