package classtasks.happyfamily;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Golden Retriever", "Enzo", 3, 45, new String[]{"eat", "sleep"});
        Pet dog = new Pet("Doberman", "Dob");
        Pet noarg = new Pet();

        Human mother =
                new Human("Jane", "Doe", 65, 120, pet, null, null, null);
        Human father =
                new Human("John", "Doe", 60, 130, pet, null, null, null);
        Human person =
                new Human("Jack", "Doe", 20);
        Human child =
                new Human("Reacher", "Doe", 15, mother, father);
        Human noargs =
                new Human();

        String[][] schedule = {
                {"Reading", "Jogging"}, // Sunday
                {"Yoga", "Coding"}, // Monday
                {"Swimming", "Painting"}, // Tuesday
                {"Dancing", "Writing"}, // Wednesday
                {"Cycling", "Gardening"}, // Thursday
                {"Hiking", "Cooking"}, // Friday
                {"Tennis", "Movies"} // Saturday
        };

        Human human = new Human("Alice", "Doe", 50, 110, pet, mother, father, schedule);

        human.printInfo();
    }
}
