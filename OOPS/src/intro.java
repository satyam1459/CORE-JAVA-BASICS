import java.util.*;

public class intro {
    public static void main(String[] args) {
    Student[] student1 = new Student[5];

    //Just declaring
    Student kunal = new Student(25,"Kunal ",90.7f);
    //kunal=new Student();
//    kunal.rno=25;
//    kunal.name= "Kunal kushwaha";
//    kunal.marks = 90.7f;

        System.out.println(kunal.marks);
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        Student arpit = new Student(17, "Arpit",89.7f);
        Student stud2 = new Student();
        System.out.println(stud2.name);

        Student one =new Student();
        Student two = one;
        two.name="Something Something";
        System.out.println(one.name);
        System.out.println(two.name);
    }
}

//create a class
//for every single student
class Student{
//Primitive data types have their default vales
    int rno;
    String name;
    float marks;

    //Student arpit = new Student(17, "Arpit",89.7f);
    //Here, this will be replaced with Arpit

    Student() {
        //this is how you call a constructor from another constructor
        this(13,"default person",100.0f);
    }
    Student(int rno, String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
}
