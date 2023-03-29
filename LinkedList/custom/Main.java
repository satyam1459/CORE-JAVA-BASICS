package LinkedList.custom;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            ll.addLast(i);
        }
        System.out.print(ll + " ");
    }

}
