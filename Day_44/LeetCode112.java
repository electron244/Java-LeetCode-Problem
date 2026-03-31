public class LeetCode112 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        targetSum -= root.val;
        if(root.left == null && root.right == null) return targetSum == 0;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right= new TreeNode(3);
        int targetSum = 5;
        LeetCode112 obj = new LeetCode112();
        boolean ans = obj.hasPathSum(root, targetSum);
        System.out.println(ans);
    }
}
