package classtasks.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Hello");

        myFunctionalInterface.myMethod();
        myFunctionalInterface.defaultMethod();

        // Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        boolean test = isEven.test(15);
        System.out.println(test);

        // Consumer
        Consumer<String> printConsumer = System.out::println;
        printConsumer.accept("This is consumer");

        // Function
        Function<String, Integer> toInger = str -> Integer.valueOf(str);
        Integer apply = toInger.apply("12");
        System.out.println(apply + 1);

        // Supplier
        Supplier<Double> randomValue = () -> Math.random();
        double value = randomValue.get();  // Məsələn, 0.123456789
        double value2 = randomValue.get(); // Məsələn, 0.987654321

    }
}
