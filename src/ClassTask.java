public class ClassTask {
    public static void main(String[] args) {
        // Task 1
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("");

        // Task 2
        int n = 7; // Satır sayısı
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Boşlukları yazdır
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*"); // Yıldızları yazdır
            }
            System.out.println(); // Her satırda bir sonraki satıra geç
        }
    }
}