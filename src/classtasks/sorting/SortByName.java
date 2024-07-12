package classtasks.sorting;

import java.util.Comparator;

public class SortByName implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getName() == o2.getName()) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
