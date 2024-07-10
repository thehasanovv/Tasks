package classtasks.parse;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add a number: ");

        try {
            parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            throw new CustomNUmberFormatException("This is not a number");
        }

    }
}
