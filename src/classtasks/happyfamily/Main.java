package classtasks.happyfamily;

import static classtasks.happyfamily.Constants.SCHEDULE;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Golden Retriever", "Enzo", 3, 45, new String[]{"eat", "sleep"});
        Pet dog = new Pet("Doberman", "Dob");

        Human mother =
                new Human("Jane", "Doe", 65, 120, null);

        Human father =
                new Human("John", "Doe", 60, 130, SCHEDULE);

        Human child1 =
                new Human("Reacher", "Doe", 15);

        Human child2 =
                new Human("Tom", "Doe", 15);

        Human child3 =
                new Human("Adele", "Doe", 15);


        Family family = new Family(mother, father, null, pet);

        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);

        System.out.println("family before " + family);
        boolean result = family.deleteChild(5);

        family.deleteChild(1);
        System.out.println("family after " + family);

    }
}
