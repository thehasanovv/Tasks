package classtasks;

import java.util.*;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();
        TreeMap treeMap = new TreeMap();

        hashMap.put("c", 43);
        hashMap.put("a", 41);
        hashMap.put("b", 42);

        linkedHashMap.put("c", 43);
        linkedHashMap.put("a", 41);
        linkedHashMap.put("b", 42);

        hashMap.put("c", 43);
        hashMap.put("a", 41);
        hashMap.put("b", 42);

//        System.out.println(hashMap);
//        System.out.println(linkedHashMap);
//        System.out.println(treeMap);
//
//        hashMap.forEach((k, v) -> System.out.println(k + ": " + v));
//        System.out.println(hashMap.containsKey(1));
//        System.out.println();

        /////////////////////////////////////////////////////////////////////////////////////
        // MAP
        Map<String, Integer> fruitBasket = new HashMap<>();
        fruitBasket.put("Apple", 4);
        fruitBasket.put("Orange", 5);
        fruitBasket.put("Tomato Cherry", 12);
        fruitBasket.put("Blueberry", 15);
        fruitBasket.put("Strawberry", 15);
        fruitBasket.put("Grape", 12);
        fruitBasket.put("Avocado", 20);

        System.out.println("Initial Fruit Basket: " + fruitBasket);

//        fruitBasket.entrySet().stream()
//                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

//        fruitBasket.entrySet().stream()
//                .filter(entry -> entry.getValue() > 10)
//                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

        int a = fruitBasket.entrySet().stream()
                .filter(entry -> entry.getValue() > 10)
                .mapToInt(Map.Entry::getValue).sum();

        List<String> list = fruitBasket.entrySet().stream()
                .filter(e -> e.getValue() <= 10)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        String list2 = fruitBasket.entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(" "));

//        System.out.println("list2 = " + list2);
//        System.out.println(a);

        ArrayList<Integer> str = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int random = (int) Math.round(Math.random() * 100);
            str.add(random);
        }

    }
}
