package LinkedList;

import java.util.*;

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add --> first , last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    // delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return this.size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        if (this.getSize() == 0)
            return "empty";
        while (curr != null) {
            sb.append(curr.data).append(" -> ");
            curr = curr.next;
        }
        sb.delete(sb.length() - 4, sb.length());
        return sb.toString();
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addLast("Satyam");
        list.addLast("Jaiswal");
        list.printList();
        System.out.println();
        list.addFirst("Idiot");
        list.printList();
        System.out.println();
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        list.addFirst("Mango");
        System.out.println();
        System.out.println(list.getSize());
        System.out.println(list);

    }
}