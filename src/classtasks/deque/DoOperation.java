package classtasks.deque;

import java.util.Deque;
import java.util.LinkedList;

public class DoOperation {
    private static Deque<Operation> deque = new LinkedList<>();

    public static void addOperation(Operation operation) {
        deque.push(operation);
    }

    public static void ctrlZ() {
        deque.poll();
    }

    public static Deque getDeque() {
        return deque;
    }

}
