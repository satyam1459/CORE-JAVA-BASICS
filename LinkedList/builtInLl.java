package LinkedList;

import java.util.LinkedList;

public class builtInLl {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("is");
        list.addFirst("a");
        System.out.println(list);

        list.addLast("this");
        list.add("Jaiswal"); // By default its added to last
        System.out.println(list);
        System.out.println(list.size());

        for (String i : list)
            System.out.println(i);

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " -> ");
        System.out.print("null");
        System.out.println();

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
