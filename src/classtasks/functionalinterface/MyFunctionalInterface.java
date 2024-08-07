package classtasks.functionalinterface;

public interface MyFunctionalInterface {
    void myMethod();

    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}
