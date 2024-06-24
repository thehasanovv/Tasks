package classtasks.guessanumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) Math.round(Math.random() * 100);

        while (true) {
            int num = sc.nextInt();
            if (randomNumber > num) {
                System.out.println("Too low");
            } else if (randomNumber < num) {
                System.out.println("Too big");
            } else {
                System.out.println("You win !");
                break;
            }

        }
    }
}
