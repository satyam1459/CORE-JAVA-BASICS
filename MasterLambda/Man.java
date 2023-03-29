package MasterLambda;

import java.util.*;

public class Man {
    public static void main(String[] args) {
        System.out.println("My system starts");
        // MyInter myInter = new MyInterImpl();
        // myInter.sayHello();
        /*
         * MyInter i = new MyInter() {
         * 
         * @Override
         * public void sayHello() {
         * System.out.println("This is first anonymous class");
         * 
         * }
         * };
         * i.sayHello();
         * 
         * MyInter i2 = new MyInter() {
         * 
         * @Override
         * public void sayHello() {
         * System.out.println("Second anonymous classs");
         * }
         * };
         * 
         * i2.sayHello();
         * 
         */

        // Using our interface with the help of lambda

        MyInter i = () -> System.out.println("this is first time i am using lambda");
        i.sayHello();

        MyInter i2 = () -> System.out.println("This is second time using lambda");
        i2.sayHello();

        SumInter sum = (a, b) -> a + b;
        System.out.println(sum.sum(2, 8));
        System.out.println(sum.sum(666, 1));

        LengthInter len = (str -> str.length());
        System.out.println("Length of string -> " + len.getLength("durgesh"));
    }

}
