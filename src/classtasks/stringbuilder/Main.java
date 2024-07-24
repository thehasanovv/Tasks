package classtasks.stringbuilder;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "programming");
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            stringBuilder.append(capitalizedWord);
            if (i < words.size() - 1) {
                stringBuilder.append("-");
            }
        }



        System.out.println(stringBuilder);


//        String str = words.stream()
//                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
//                .collect(Collectors.joining("-"));
//        System.out.println(str);
    }
}
