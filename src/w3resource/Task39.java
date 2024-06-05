package w3resource;

public class Task39 {
    public static void main(String[] args) {
        int totalNumber = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        System.out.printf("%d%d%d\n", i, j, k);
                        totalNumber++;
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + totalNumber);
    }
}
