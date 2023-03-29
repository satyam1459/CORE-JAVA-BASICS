public class oops {
    public static class Person{
        int age;
        String name;
        void saysHi(){
            System.out.println(name+"["+age+"] says Hi !");
        }
    }
    public static void main(String[] args) {
        //new will allocate memory in stack
        Person p1=new Person();
        p1.age=20;
        p1.name="A";
        //p1.saysHi();

        Person p2=new Person();
        p2.age=10;
        p2.name="B";
      //  p2.saysHi();

//        Person p3=p1;           //p1,p2,p3 are the three references
//        p3.age=30;              //age and name are the two instances
//        p3.saysHi();
//        p1.saysHi();

        p1.saysHi();
        p2.saysHi();
        //swap1(p1,p2);           //Reference will swap in function which get terminated with end of function
        //swap2(p1,p2);
        swap3(p1,p2);
        p1.saysHi();
        p2.saysHi();
    }
    static void swap1(Person psn1, Person psn2){
        Person temp=psn1;
        psn1=psn2;
        psn2=temp;
    }
    static void swap2(Person psn1,Person psn2){
       //Changes will occur in heap at instance variable
        int age=psn1.age;
        psn1.age=psn2.age;
        psn2.age=age;

        String temp=psn1.name;
        psn1.name=psn2.name;
        psn2.name=temp;
    }
    static void swap3(Person psn1,Person psn2){
        psn1=new Person();
        int age=psn1.age;
        psn1.age=psn2.age;
        psn2.age=age;

        psn2=new Person();
        String temp=psn1.name;
        psn1.name=psn2.name;
        psn2.name=temp;
        //psn1 saved from change because entering into function it allocate new memory in stack
        // so all changes in created in new memory of psn1
    }
}
