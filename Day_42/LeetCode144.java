import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode node, List<Integer> res) {
        if (node == null)
            return;
        res.add(node.val);
        preorder(node.left, res);
        preorder(node.right, res);

    }

    public static void main(String[] args) {
        LeetCode144 obj = new LeetCode144();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> ans = obj.preorderTraversal(root);
        System.out.println(ans);
    }
}