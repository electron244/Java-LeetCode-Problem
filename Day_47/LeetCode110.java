import java.util.LinkedList;
import java.util.Queue;

public class LeetCode110 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int left = checkHeight(node.left);
        if (left == -1) return -1;

        int right = checkHeight(node.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }

    public static TreeNode buildTree(int[] values) {
        if (values == null || values.length == 0 || values[0] == -1) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode current = queue.poll();

            if (i < values.length) {
                if (values[i] != -1) {
                    current.left = new TreeNode(values[i]);
                    queue.add(current.left);
                }
                i++;
            }

            if (i < values.length) {
                if (values[i] != -1) {
                    current.right = new TreeNode(values[i]);
                    queue.add(current.right);
                }
                i++;
            }
        }

        return root;
    }

    public static void printTree(TreeNode root, String indent, boolean isLeft) {
        if (root == null) return;
        printTree(root.right, indent + (isLeft ? "│   " : "    "), false);
        System.out.println(indent + (isLeft ? "└── " : "┌── ") + root.val);
        printTree(root.left, indent + (isLeft ? "    " : "│   "), true);
    }

    public static void main(String[] args) {
        LeetCode110 solution = new LeetCode110();
        int[] values1 = {3, 9, 20, -1, -1, 15, 7};
        TreeNode root1 = buildTree(values1);
        System.out.println("Test Case 1:");
        printTree(root1, "", true);
        System.out.println("Is Balanced: " + solution.isBalanced(root1));
        System.out.println();

       
        int[] values2 = {1, 2, 2, 3, 3, -1, -1, 4, 4};
        TreeNode root2 = buildTree(values2);
        System.out.println("Test Case 2:");
        printTree(root2, "", true);
        System.out.println("Is Balanced: " + solution.isBalanced(root2));
        System.out.println();

      
        TreeNode root3 = null;
        System.out.println("Test Case 3: Empty Tree");
        System.out.println("Is Balanced: " + solution.isBalanced(root3));
        System.out.println();

        TreeNode root4 = buildTree(new int[]{1});
        System.out.println("Test Case 4: Single Node");
        printTree(root4, "", true);
        System.out.println("Is Balanced: " + solution.isBalanced(root4));
        System.out.println();

        int[] values5 = {1, 2, -1, 3};
        TreeNode root5 = buildTree(values5);
        System.out.println("Test Case 5: Left-Skewed Tree");
        printTree(root5, "", true);
        System.out.println("Is Balanced: " + solution.isBalanced(root5));
    }
}