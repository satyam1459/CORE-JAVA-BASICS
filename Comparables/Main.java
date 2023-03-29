package Comparables;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(27, "Amit"));
        students.add(new Students(35, "Ajay"));
        students.add(new Students(23, "Shyam"));
        students.add(new Students(22, "Amit"));

        // Collections.sort(students);

        // Collections.sort(students, new sortByNameThenMarks());

        // Without making class(Anonymous class)

        /*
         * Collections.sort(students, new Comparator<Students>() {
         * public int compare(Students o1, Students o2) {
         * if (o1.name.equals(o2.name))
         * return o1.marks - o2.marks;
         * else
         * return o1.name.compareTo(o2.name);
         * }
         * });
         */

        // After Java 8 ,lambda introduced
        /*
         * Collections.sort(students, (o1, o2) -> {
         * if (o1.name.equals(o2.name))
         * return o1.marks - o2.marks;
         * else
         * return o1.name.compareTo(o2.name);
         * });
         */

        // If you want to compare by name only then

        // Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name)); */

        // Collections.sort(students, Comparator.comparing(Students::getName));

        // Collections.sort(students, Comparator.comparing(Students::getName));

        /*
         * //This will compare first on basis of name if name is equal, then compare on
         * basis of students
         * Collections.sort(students,
         * Comparator.comparing(Students::getName).thenComparing(Students::getMarks));
         */
        students.forEach(System.out::println);
    }
}

class sortByNameThenMarks implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        if (o1.name.equals(o2.name))
            return o1.marks - o2.marks;
        else
            return o1.name.compareTo(o2.name);
    }
}
