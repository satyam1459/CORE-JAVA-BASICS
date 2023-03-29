package OOPS.src.com.kunal.introdution.inheritance;

public class Box {
    double l;
    double h;
    double w;
    Box(){
        super();  //Here there is nothing above Box class still super don't so error
        // All class in java inherits object class of Java
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    //cube
    Box (double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h , double w){
        System.out.println("Box class constructor");
        this.l=l;
        this.h=h;
        this.w=w;
    }
    //copy constructor
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
