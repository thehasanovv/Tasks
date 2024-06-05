package w3resource;

public class Task13 {
    public static void main(String[] args) {
        // Define width and height of the rectangle
        double width = 5.6;
        double height = 8.5;

        // Calculate the perimeter
        double perimeter = 2 * (height + width);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f \n", height, width, perimeter);

        // Calculate the area
        double area = width * height;
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }
}
