public class BST_UC2 {

    static Node add(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = add(root.left, data);
        } else {
            root.right = add(root.right, data);
        }

        return root;
    }

    static int size(Node root) {

        if (root == null) {
            return 0;
        }

        return size(root.left) + size(root.right) + 1;
    }

    public static void main(String[] args) {

        Node root = null;

        int[] arr = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};

        for (int x : arr) {
            root = add(root, x);
        }

        System.out.println("size of bst : " + size(root));
    }
}
