package LinkedListKUnal;

public class doublyLL {
    Node head;
    private int size;

    doublyLL() {
        this.size = 0;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        size++;
        Node last = head;

        if (head == null) {
            node.prev = null;
            node.next = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void addAt(int val, int idx) {
        if (idx == 0) {
            addFirst(val);
            return;
        }
        if (idx == getSize()) {
            addLast(val);
            return;
        }
        Node previous = head;
        for (int i = 0; i < idx - 1; i++) {
            previous = previous.next;
        }
        Node node = new Node(val, previous.next, previous);
        previous.next.prev = node;
        previous.next = node;
        size++;

    }

    // Insert a node if node is given instead of index
    // Step.1--> Find node of that value
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value)
                return node;
            node = node.next;
        }
        return null;
    }

    // Step-2 Now insert value after finding node
    public void addAfter(int after, int value) {
        Node prev = find(after);
        if (prev == null) {
            System.out.println("does not exist after value");
            return;
        }
        Node node = new Node(value);
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;
        if (node.next != null) {
            node.next.prev = node;
        }
        size++;
    }

    public void reversePrint() {
        int lastIdx = getSize();
        Node last = head;
        for (int i = 0; i < lastIdx - 1; i++) {
            last = last.next;
        }
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    public int getSize() {
        return this.size;
    }

    public class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

}
