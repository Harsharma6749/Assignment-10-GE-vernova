class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}





public class BST_UC1 {

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

    public static void main(String[] args) {

        Node root = null;

        root = add(root, 56);
        root = add(root, 30);
        root = add(root, 70);

        System.out.println("bst created");
    }
}
