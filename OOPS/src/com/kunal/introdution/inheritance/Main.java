package OOPS.src.com.kunal.introdution.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1=new Box(4,7.9,8);
//        Box box2=new Box(box1);
//        box1.information();
//        System.out.println(box1.l+" "+box1.w+" "+box1.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4=new BoxWeight(2,3,4,5);
//        System.out.println(box3.h+" "+box3.weight);

//        reference type of box which is referencing to an object of boxweight type
        Box box5= new BoxWeight(2,3,4,8);
        System.out.println(box5.h);
// When a reference to a subclass object is assigned to a superclass object
// Like in this example, you will have access to only those object which are defined in super class

//There are many variables in both parent and child classes
//You are given access to variables that are in the ref type i.e, BoxWeight
//Hence , you should have access to weight variable.
// This also means, that the ones you are trying to access should be initialised
// But here, when the obj itself is of type parent class ,how will you call the constructor of child class
 //this is why error
//   BoxWeight box6 = new Box(3,5,6,4);
//        System.out.println(box6);

    BoxPrice box = new BoxPrice(5,8,200);


    }
}
