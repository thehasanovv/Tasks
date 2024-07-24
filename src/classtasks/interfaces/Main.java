package classtasks.interfaces;

public class Main {
    public static void main(String[] args) {
        A a = new Animal();
        B b = new Animal();

        System.out.println(a.makeSound());
        System.out.println(b.makeSound());
    }

}
