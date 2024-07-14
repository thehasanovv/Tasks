package solutions.w3resource;

public class Task14 {


    public static void main(String[] args) {
        String text1 = "* * * * * * ==================================";
        String text2 = " * * * * *  ==================================";
        String text3 = "==============================================";

        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) {
                System.out.println(text2);
            } else {
                System.out.println(text1);
            }
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(text3);
        }
    }
}
