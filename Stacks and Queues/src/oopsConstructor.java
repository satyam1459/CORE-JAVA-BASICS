import java.util.*;
public class oopsConstructor {
    public static class Person{
        int age;
        String name;
        void saysHi(){
            System.out.println(name+"["+age+"] says Hi !");
        }
        //if we forget ,java provides a default constructor
        //Constructor--> same name as class , called by new keyword, default
        Person(){
            //Default Constructor---> if we don't create it java automatically create it

        }
        //Parameterized Constructor
        Person(int age, String name){
            this.age=age;
            this.name=name;
        }
        //Note--> If we create parameterized constructor , then java will not provide default constructor ,it will give error
    }
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=20;
        p1.name="A";
        p1.saysHi();

        Person p2=new Person(30,"B");
        p2.saysHi();
    }
}
