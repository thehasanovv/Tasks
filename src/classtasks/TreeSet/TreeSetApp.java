package classtasks.TreeSet;

import java.util.*;

public class TreeSetApp {

    public static void main(String[] args) {
        Set demoSet = new TreeSet();

        Name name1 = new Name("Elnur");
        Name name2 = new Name("Elnur");
        Name name3 = new Name("Rüstəm");
        Name name4 = new Name("Arzu");
        Name name5 = new Name("İlqar");

        demoSet.add(name1);
        demoSet.add(name2);
        demoSet.add(name3);
        demoSet.add(name4);
        demoSet.add(name5);

        System.out.println(demoSet);

    }
}
