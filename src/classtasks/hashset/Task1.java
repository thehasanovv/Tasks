package classtasks.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        HashSet<String> names1 = new HashSet<>();

        names1.add("Arzu");
        names1.add("Elnur");
        names1.add("Rustam");
        names1.add("Nubar");
        names1.add("Nicat");

        if (names1.contains(name)) {
            System.out.println("Names  found");
        } else {
            System.out.println("Names not found");
        }

//        names1.remove(name);
//        for (String n : names1) {
//            System.out.println(names1);
//        }

        HashSet<String> names2 = new HashSet<>();
        names2.add("Arzu");
        names2.add("Elnur");
        names2.add("Rasim");
        names2.add("Nabat");
        names2.add("Khagani");

        HashSet<String> names3 = new HashSet<>();
        names3.addAll(names1);
        names3.addAll(names2);
        System.out.println(names3);



        names1.retainAll(names2);
        System.out.println("Common names: " + names1);

        HashSet<String> names4 = new HashSet<>(names1);
        System.out.println("Names set: " + names4);

    }
}
