package Generics.Generic;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>("String");
        // box.container = 45;
        System.out.println(box.getValue());
        // You can also check type of value
        System.out.println(box.container.getClass().getName());
    }

}
