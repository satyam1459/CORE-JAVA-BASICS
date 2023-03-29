package com.kunal.introdution.staticExamples;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("static -->Hello World");
       //You cannot use this method in static method
        //This represents an object and static doesn't depend on object
        // System.out.println(this.age);
    }
    public Human(int age, String name, int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;

        //Access the static variable use class name
        Human.population += 1;
    }
}
