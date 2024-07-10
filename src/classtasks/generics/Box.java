package classtasks.generics;

public class Box<T> {
    T data;
    boolean isEven;

    public Box(T data, boolean isEven) {
        this.data = data;
        this.isEven = isEven;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Box{" +
                "data=" + data +
                ", isEven=" + isEven +
                '}';
    }
}
