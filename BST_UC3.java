public class BST_UC3 {

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

    static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {

        Node root = null;

        int[] arr = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};

        for (int x : arr) {
            root = add(root, x);
        }

        int key = 63;

        if (search(root, key)) {
            System.out.println(key + " found");
        } else {
            System.out.println(key + " not found");
        }
    }
}
