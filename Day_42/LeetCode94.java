import java.util.ArrayList;
import java.util.List;

public class LeetCode94 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode node, List<Integer> res) {
        if (node == null)
            return;
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);

    }

    public static void main(String[] args) {
        LeetCode94 obj = new LeetCode94();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> ans = obj.inorderTraversal(root);
        System.out.println(ans);
    }
}