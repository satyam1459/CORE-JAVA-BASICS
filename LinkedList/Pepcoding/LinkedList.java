package LinkedList.Pepcoding;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    LinkedList() {
        this.size = 0;
    }

    void addLast(int data) {
        Node temp = new Node(data);
        temp.next = null;
        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int size() {
        return this.size;
    }

    public void display() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
