package classtasks.deque;

public enum Operation {
    END, UNDO, REPO, HOME, ENTER, RENAME, DELETE;

    public static Operation getOperation() {
        final int random = (int) (Math.random() * Operation.values().length);
        return Operation.values()[random];
    }
}
