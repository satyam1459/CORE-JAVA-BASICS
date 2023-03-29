package LinkedList.custom;

public class CustomLinkedList {
    Node head;
    Node tail;
    int size;

    public void addLast(int data) {
        Node tba = new Node(data);
        if (head == null) {
            head = tba;
            tail = tba;
        } else {
            tail.next = tba;
            tail = tba;
        }
        size++;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void addAt(int data, int idx){
        if(idx == 0)    addFirst(data);
        else if(idx == this.size)   addLast(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }

        sb.append("null");
        return sb.toString();
    }

}