package classtasks.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[10];
        System.out.println(Arrays.toString(words));

        Optional<String> checkNull = Optional.ofNullable(words[5]);
        System.out.println(checkNull.isPresent());

        String empty = checkNull.orElse("empty");
        System.out.println(empty);

//        checkNull.orElseThrow(() -> {
//            throw new RuntimeException("Empty");
//        });

        // creating a string array
        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";

        // It returns an empty instance of Optional class
        Optional<String> empty2 = Optional.empty();
        System.out.println(empty2);

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);
    }

}
