package OOPS.src;

class Animal{
    public void eat() {                  //Behaviour
        System.out.println("I am eating");
    }
    public void run(){
        System.out.println("I am running");
    }
}
public class Object {
    public static void main(String[] args) {
        System.out.println("1");
        //We need to create object
        Animal buzo;  //declaration
        buzo = new Animal();  //Instantiation and initialisation
        buzo.eat();
        buzo.run();
    }
}
