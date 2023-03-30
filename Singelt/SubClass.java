package Singelton.Singelton;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Satyam");
        // int n = obj.num;
        //System.out.println();
    }
}

 class SubSubClass extends SubClass {

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(45, "Satyam");
        int n = obj.num;
        // System.out.println(n);
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45, "satyam");
        // int n = obj.num;
        // System.out.println(n);
    }
}