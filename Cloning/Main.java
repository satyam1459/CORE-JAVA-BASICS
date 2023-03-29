package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(25, "Kunal Kushwaha");

        // Actually here we are making a copy of kunal
        // The problem is that it's taking a lot of processing time because we are takin
        // another new keyword.
        // Instead we can use clone method
        // Human twin = new Human(kunal);
        // Clone is just method which can be used to make exact copy of object
        // In java there is in lang package there is interface clonable so we must
        // implement that by the class whose clone you want to make

        Human twin = (Human) kunal.clone(); // its faster way to copy
        System.out.println(twin.name + " " + twin.age);
        System.out.println(Arrays.toString(twin.ar));

        twin.ar[0] = 100;
        // here kunal.arr is also changing,--> this is called shallow copying
        // System.out.println(Arrays.toString(kunal.ar));

        // Now in deep copy kunal is not changed
        System.out.println(Arrays.toString(kunal.ar));
        System.out.println(Arrays.toString(twin.ar));
    }
}
