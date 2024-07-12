package classtasks.sort2;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Əziz", 27, 77));
        students.add(new Student("Nicat", 27, 88));
        students.add(new Student("Əziz", 27, 70));
        students.add(new Student("Rüstəm", 27, 77));
        students.add(new Student("Ilqar", 22, 100));

        return students;
    }
}
