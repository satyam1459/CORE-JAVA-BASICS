package OOPS.src;

//Object initialisation by reference variable
class Animal1{
    String color;
    int age;
}

//Object initialisation by method
class Animal2{
    String color;
    int age;
    void initObj(String c, int a){
        color = c;
        age = a;
        System.out.println("Call using method--> "+c+" "+a);
    }
}
public class objectInitialisation {
    public static void main(String[] args) {
        Animal1 buzo = new Animal1();
        buzo.color ="Black";
        buzo.age = 23;
        System.out.println("Call using reference variable --> "+buzo.color+" "+buzo.age);

        Animal2 buza =new Animal2();
        buza.initObj("black",43);
//        buzo.display();
    }
}
