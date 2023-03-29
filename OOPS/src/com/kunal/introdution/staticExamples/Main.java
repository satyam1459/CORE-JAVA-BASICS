package com.kunal.introdution.staticExamples;

//If method is in the same package , you don't need to import

import static com.kunal.introdution.staticExamples.Human.message;
import com.kunal.introdution.staticExamples.Human;
public class Main {
    public static void main(String[] args) {
        Human satyam=new Human(12,"Satyam",10000,false);
        Human rahul=new Human(34,"Rahul",25000,true);
        System.out.println(satyam.name);
        System.out.println(rahul.population);
        fun();
    }
    static void fun(){
       // greeting();   //You can't use this because it requires an instance
        //but the function you are using it in does not depend on instances

        //You cannot access non-static stuff without referencing their instances in
        // a static context

        //hence here I am referencing it
        Main obj = new Main();
        obj.greeting();
        obj.fun2();
        message();
    }

    void fun2(){
        greeting(); //In the end you need to create a object in end
    }
    void greeting(){
        //fun();
        System.out.println("Hello World");
    }
}
