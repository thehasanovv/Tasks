package classtasks.stringbuilder2;

public class Main {
    public static void main(String[] args) {
        String sentence = "Hello world Java programming";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sentence);
        stringBuilder.reverse();

        System.out.println(stringBuilder);
    }
}
