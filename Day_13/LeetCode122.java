public class LeetCode122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        LeetCode122 obj = new LeetCode122();
        int[] prices = {7,1,5,3,6,4};
        int ans = obj.maxProfit(prices);
        System.out.println(ans);
    }
}

