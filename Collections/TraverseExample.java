package Collections;

import java.util.*;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Satyam");
        names.add("Seeta");
        names.add("Geeta");
        names.add("Ram");
        names.add("Mohan");
        // for each loop
        System.out.println("____For each method____");
        for (String s : names) {
            System.out.print(s + "\t" + s.length() + "\t");
            StringBuffer br = new StringBuffer(s);
            System.out.println(br.reverse() + " ");
        }
        System.out.println("******Using ITERATOR*******");

        // traverse using ITERATOR
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        System.out.println("----LIST ITERATOR-->(BACKWARD)----");
        // backward traversal of collection LIST_ITERATOR
        ListIterator<String> litr = names.listIterator(names.size());
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
        System.out.println();
        // Using lambda expression
        System.out.println("====LAMBDA EXPRESSION======");
        names.forEach(e -> {
            System.out.print(e + " ");
        });
    }
}
