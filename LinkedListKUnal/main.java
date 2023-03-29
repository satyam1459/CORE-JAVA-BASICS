package LinkedListKUnal;

import java.util.*;

public class main {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.addFirst(3);
        // list.addFirst(12);
        // list.addFirst(23);
        // list.addFirst(122);
        // list.addFirst(111);
        // list.addLast(33);
        // list.addAt(1111111, 2);
        // list.display();
        // System.out.println(list.deleteFirst());

        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.deleteAt(2));
        // list.display();
        // System.out.println(list.find(12));

        // circularLL list = new circularLL();
        // list.insert(22);
        // list.insert(32);
        // list.insert(33);
        // list.delete(32);
        // list.insert(222);
        // list.display();

        // doublyLL list = new doublyLL();
        // list.addFirst(33);
        // list.addFirst(22);
        // list.addFirst(21);
        // list.addFirst(11);

        // list.addLast(200);
        // list.addLast(98);
        // list.display();
        // System.out.println(list.getSize());
        // list.addAt(92, 3);
        // list.addAfter(200, 210);

        // list.display();

        // list.reversePrint();
        // System.out.println(list.getSize());

        LL list1 = new LL();
        list1.insertRec(1, 0);
        list1.insertRec(22, 0);
        list1.insertRec(12, 2);
        list1.insertRec(222, 1);
        list1.display();
    }

}
