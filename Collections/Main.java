package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to code java collection framework..!!");

        /*
         * creating Collection
         * 1) Type Safe--> same type of elements (objects) are added to collection
         * 2) UnType Safe --> different type of elements can be added to collection
         */
        // type safe collection (Generic way of creating)
        ArrayList<String> names = new ArrayList<>();
        names.add("Satyam");
        names.add("Seeta");
        names.add("Geeta");
        names.add("Ram");
        names.add("Mohan");
        System.out.println(names.set(3, "Diana"));
        Collections.sort(names);
        System.out.println(names);
        names.remove(3);
        System.out.println(names.size());
        System.out.println(names.contains("Satyam"));
        // names.clear();
        System.out.println(names.isEmpty());
        names.add(1, "Satyam ");
        System.out.println(names);

        ArrayList<String> list = new ArrayList<>();
        list.addAll(names);
        System.out.println(list);
        System.out.println("______________________________________________");

        HashSet<Double> nms = new HashSet<>();
        nms.add(14.44);
        nms.add(443.132); // Java has AutoBoxing and unboxing automatically done
        nms.add(new Double(323.44));
        System.out.println(nms);

        TreeSet<Double> tset = new TreeSet<>(); // Add element in sorted order
        tset.addAll(nms);
        System.out.println(tset);

        // untype safe
        // LinkedList list = new LinkedList();
        // list.add("Sachin");
        // list.add(344);
        // list.add(333.222);
        // System.out.println(list);

    }
}
