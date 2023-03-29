package BinarySearchTree;

public class DemoBST1 {

    TreeNode root;

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    DemoBST1() {
        root = null;
    }

    public TreeNode insert(TreeNode root, int dataToBeInserted) {
        if (root == null) {
            root = new TreeNode(dataToBeInserted);
            return root;
        }
        if (root.data > dataToBeInserted) {
            root.left = insert(root.left, dataToBeInserted);
        } else if (root.data < dataToBeInserted) {
            root.right = insert(root.right, dataToBeInserted);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int dataToBeSearched) {
        if (root == null || root.data == dataToBeSearched)
            return root;

        if (root.data > dataToBeSearched) {
            return search(root.left, dataToBeSearched);
        } else {
            return search(root.right, dataToBeSearched);
        }
    }

    public void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void insertIntoTree(int dataToBeInserted) {
        root = insert(root, dataToBeInserted);
    }

    public TreeNode searchTree(int dataToBeSearched) {
        return search(root, dataToBeSearched);
    }

    public void inOrderTraversal() {
        inOrder(root);
    }
}
