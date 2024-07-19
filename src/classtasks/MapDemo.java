package classtasks;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapDemo {
    public static void main(String[] args) {

        String[] students = new String[]{"Elnur", "Elnur", "Rüstəm", "Rüstəm", "Arzu"};
        Set<String> collect = Arrays.asList(students)
                .stream()
                .collect(Collectors.toSet());
        AtomicInteger index = new AtomicInteger(1);

//        Map<Integer, String> studentsMap = collect.stream()
//                .collect(Collectors.toMap(
//                        name -> index.getAndIncrement(),
//                        name -> name
//                ));
//
//        studentsMap.forEach((key, value) -> System.out.println(key + " " + value));
        collect.forEach(s -> System.out.println(index.getAndIncrement() + " " + s));
        ///////////////////////////////////////////////////
        List<String> names = new ArrayList<>();
        names.add("Elnur");
        names.add("Rüstəm");
        names.add("Arzu");

        Map<Integer, String> namesMap = IntStream.range(0, names.size())
                .boxed()
                .collect(Collectors.toMap(i -> i + 1, names::get));

//        namesMap.forEach((key, value) -> System.out.println(key + " " + value));
//
    }
}
