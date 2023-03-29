package OOPS.src.com.kunal.introdution.polymorphism;

public class Circle extends Shapes {

//    This will run when obj of Circle is created
//    Hence it is overriding the parent method
    @Override   //This is called annotation (Use for check purpose)
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
