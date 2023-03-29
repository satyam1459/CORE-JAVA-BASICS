package Abstraction;

//You cannot have a final Parent class
public abstract class Parent {
    int age;

    final int value;

    public Parent(int age) {
        this.age = age;
        value = 2344444;
    }

    // You cannot create a abstract constructor or constrcutor of abstract class
    // abstract Parent();

    // You can create static method in abstract class

    // Cannot create abstract static method
    // But can create static method
    static void hello() {
        System.out.println("hey");
    }

    // You can have non abstract methods with body
    void normal() {
        System.out.println("This is a normal method.");
    }

    abstract void career();

    abstract void partner();
}
