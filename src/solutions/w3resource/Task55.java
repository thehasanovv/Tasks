package solutions.w3resource;

public class Task55 {
    public static void main(String[] args) {
        int seconds = 86399;
        calculateTimeAndPrint(seconds);
    }

    public static void calculateTimeAndPrint(int secs) {
        int hours = secs / 3600;
        int minutes = (secs % 3600) / 60;
        int seconds = secs % 60;

        System.out.println("Input seconds: 86399");
        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println(timeString);
    }
}
