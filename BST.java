
import java.util.Scanner;

public class BST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Scanner sc = new Scanner(System.in);

    public static Node buildBST(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = buildBST(root.left, data);
        } else {
            root.right = buildBST(root.right, data);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node input(Node root) {
        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        while (data != -1) {
            root = buildBST(root, data);
            data = sc.nextInt();
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        root = input(root);
        inorder(root);
    }
}