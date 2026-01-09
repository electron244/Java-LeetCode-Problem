package Day_11;

public class LeetCode746 {
    public int minCostClimbingStairs(int[] cost) {
        int first = cost[0];
        int second = cost[1];

        if (cost.length <= 2) return Math.min(first, second);
        for (int i = 2; i < cost.length; i++) {
            int curr = cost[i] + Math.min(first, second);
            first = second;
            second = curr;
        }
        return Math.min(first, second);
    }

    public static void main(String[] args) {
        LeetCode746 obj = new LeetCode746();
        int ans = obj.minCostClimbingStairs(new int[]{10, 15, 20});
        System.out.println(ans);
    }
}
