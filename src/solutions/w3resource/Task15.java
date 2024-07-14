package solutions.w3resource;

public class Task15 {
    public static void main(String[] args) {
        int a = 50;
        int b = 25;

        printMessage("Before Swap", a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        printMessage("After Swap", a, b);
    }

    public static void printMessage(String str, int a, int b) {
        System.out.println(str);
        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");
    }
}
