package w3resource;

public class Task56 {
    public static void main(String[] args) {
        int x = 5;
        int y = 20;
        int p = 3;
        int count = 0;

        for (int i = x; i <= y; i++)
            if (i % p == 0)
                count++;

        // Print the result
        System.out.println(count);
    }
}
