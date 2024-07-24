package classtasks.interfaces;

public class Animal implements A, B{
    @Override
    public boolean makeSound() {
        System.out.println("Hav hav");
        return false;
    }
}
