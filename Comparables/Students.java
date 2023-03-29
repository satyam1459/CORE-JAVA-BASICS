package Comparables;

public class Students implements Comparable<Students> {
    int marks;
    String name;

    public Students(int marks, String name) {
        super();
        this.marks = marks;
        this.name = name;
    }

    public String toString() {
        return "Student [ marks = " + marks + ", name = " + name + "]";
    }

    public int getMarks() {
        return this.marks;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Students o) {
        if (this.marks > o.marks)
            return 1;
        else if (this.marks < o.marks)
            return -1;
        else
            return this.name.compareTo(o.name); // if have same marks then,this will compare on the basis of name.
    }
}
