package OOPS.src.com.kunal.introdution.inheritance;

class Animal{
    void eat(){
        System.out.println("I am eating");
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Overriding--> I am eating");
    }
}
public class inherit {
    public static void main(String[] args) {
        Animal buzo = new Dog();
        buzo.eat();
    }
}
