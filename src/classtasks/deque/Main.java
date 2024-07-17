package classtasks.deque;

import static classtasks.deque.DoOperation.*;
import static classtasks.deque.Operation.getOperation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Before remove: " + getDeque());
        addOperation(getOperation());
        System.out.println("Before remove: " + getDeque());
        addOperation(getOperation());
        System.out.println("Before remove: " + getDeque());
        addOperation(getOperation());
        System.out.println("Before remove: " + getDeque());

        System.out.println();

        ctrlZ();
        System.out.println("After ctrlZ: " + getDeque());
        ctrlZ();
        System.out.println("After ctrlZ: " + getDeque());
        ctrlZ();
        System.out.println("After ctrlZ: " + getDeque());
        ctrlZ();

    }
}
