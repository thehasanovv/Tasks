public class ClassTask {
    public static void main(String[] args) {
        String s1 = "sa";
        String s2 = "sa";
        s2 = s2.concat(s1);
        System.out.println(s2);

        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("=========================");
        // Task 1
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("");

        // Task 2
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}