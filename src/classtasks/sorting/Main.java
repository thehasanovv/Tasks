package classtasks.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Smith", 20);
        Player p2 = new Player("Jones", 20);
        Player p3 = new Player("Smith", 15);

        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);

        System.out.println("Players before sorting:");
        System.out.println(players + "\n");

//        Collections.sort(players);
//        Collections.sort(players, new SortByName());
        Collections.sort(players, (o1, o2) -> -Integer.compare(o1.getAge(), o2.getAge()));

        System.out.println("Players after sorting:");
        System.out.println(players);
    }
}
