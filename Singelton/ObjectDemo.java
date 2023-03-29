package Access;

import java.util.*;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float d) {
        this.num = num;
        this.gpa = d;
    }

    @Override
    // already covered this topic

    // Give random value in hashcode
    // Here we will override hashcode of object class
    public int hashCode() {
        return super.hashCode();
        // gives number representation of an object
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo) obj).num;
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(12, 56.66f);
        // System.out.println(obj.hashCode());

        ObjectDemo obj1 = new ObjectDemo(12, 23.555f);

        /*
         * (==)--> this is a comparator ,only check whether they are pointing to same
         * object or not
         * .equals is a method it checks the content of it.
         */

        if (obj == obj1)
            System.out.println("obj is equal to obj1");

        if (obj.equals(obj1))
            System.out.println("obj is equal to obj1");

        System.out.println(obj instanceof Object);

        System.out.println(obj.getClass());

        System.out.println(obj.getClass().getName());

    }
}
