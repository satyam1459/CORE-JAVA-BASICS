package Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(55);
        son.career();

        Daughter daughter = new Daughter(44);
        daughter.career();
        daughter.normal();

        // For abstract class you cannot create object like this
        // Parent mom = new Parent(55);
        Parent.hello();

        // Even you cannot create an object of abstract class
        // But you can create a refernce variable of abstract class
        Parent mom = new Son(45);
        mom.career();
    }
}
