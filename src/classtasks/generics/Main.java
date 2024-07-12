package classtasks.generics;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = generateNumber();
        System.out.println(box);
    }

    public static Box<Integer> generateNumber() {
        int random = (int) Math.round(Math.random() * 100);
        boolean isEven = random % 2 == 0;
        return new Box<>(random, isEven);
    }
}

