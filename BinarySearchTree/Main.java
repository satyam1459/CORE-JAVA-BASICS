package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        DemoBST1 bst = new DemoBST1();
        bst.insertIntoTree(20);
        bst.insertIntoTree(5);
        bst.insertIntoTree(22);
        bst.insertIntoTree(1);
        bst.insertIntoTree(7);
        bst.inOrderTraversal();
        System.out.println();
        bst.preOrder(bst.root);
        System.out.println();
        bst.postOrder(bst.root);
        System.out.println("\n" + bst.searchTree(90));
    }

}
