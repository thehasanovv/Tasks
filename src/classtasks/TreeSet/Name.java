package classtasks.TreeSet;

public class Name implements Comparable<Name> {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Name o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
