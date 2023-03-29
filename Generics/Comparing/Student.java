package Generics.Comparing;

public class Student implements Comparable<Student> {
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("in compare to method on marks");
        int diff = (int) (this.marks - o.marks);

        // if dif == 0: means both are equal
        // if diff < 1 : means o is bigger else o is smaller

        return diff;
    }

    public String toString() {
        // return marks + " " + rollNo;
        return marks + " ";
    }

}
