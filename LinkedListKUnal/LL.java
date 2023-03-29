package LinkedListKUnal;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null)
            tail = head;
        size += 1;
    }

    /*
     * The benefit of creating tail is
     * that it will helps to addLast in constant time,
     * so maintain tail position
     */
    public void addLast(int val) {
        if (tail == null) {
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size--;
        return val;
    }

    // when you doing recursion in linked list--> you can do two things
    // 1-> void return type & make changes in linked list
    // 2-> node return type that returns the list node to change the structure

    // insert using recursion
    public void insertRec(int val, int idx) {
        head = insertRec(val, idx, head);
    }

    private Node insertRec(int val, int idx, Node node) {
        if (idx == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, idx - 1, node.next);
        return node;
    }

    public void addAt(int val, int idx) {
        if (idx == 0) {
            addFirst(val);
            return;
        }
        if (idx == size) {
            addLast(val);
            return;
        }
        Node curr = head; // this will take 0 idx
        for (int i = 0; i < idx - 1; i++) {
            curr = curr.next;
        }
        Node newNode = new Node(val, curr.next);
        curr.next = newNode;
        size++;
    }

    public int deleteLast() {
        if (size <= 1)
            return deleteFirst();

        Node secondLast = get(size - 1);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteAt(int idx) {
        if (idx == 0)
            return deleteFirst();
        if (idx == size - 1)
            return deleteLast();

        Node prev = get(idx - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int idx) {
        Node node = head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
