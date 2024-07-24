package classtasks.hashmap2;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String country = "AZERBAIJAN";

        Map<Character, Long> charCountMap = country.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(charCountMap);
    }
}
