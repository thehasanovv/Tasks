package classtasks;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumbes {
    public static void main(String[] args) {
        final List<Integer> list = new Random()
                .ints(50, 0, 100)
                .boxed()
                .toList();
        final List<Integer> list1 = IntStream.range(10, 100).boxed().toList();
        System.out.println(list1);

    }
}
