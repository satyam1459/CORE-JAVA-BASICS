package OOPS.src.com.kunal.introdution.inheritance;

class A1{
    void showA(){
        System.out.println("A class method");
    }
}

class B1 extends A1{
    void showB(){
        System.out.println("B class method");
    }
}

class C1 extends A1{
    void showC(){
        System.out.println("C class method");
    }
}
public class hierarchial {
    public static void main(String[] args) {
        A1 ob1 = new A1();
        ob1.showA();

        B1 ob2 = new B1();
        ob2.showA();
        ob2.showB();

       C1 ob3 = new C1();
       ob3.showA();
       ob3.showC();
    }
}
