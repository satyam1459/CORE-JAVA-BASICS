package OOPS.src.com.kunal.introdution.inheritance;

class A{
    void showA(){
        System.out.println("A class method");
    }
}
class B extends A{
    void showB(){
        System.out.println("B class method");
    }
}
class C extends B{
    void showC(){
        System.out.println("C class method");
    }
}

public class multiLevel {
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.showA();

        B ob2 = new B();
        ob2.showA();
        ob2.showB();

        C ob3 = new C();
        ob3.showA();
        ob3.showB();
        ob3.showC();
    }
}
