public class LeetCode1208{
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int left = 0;
        int currentCost = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {

            currentCost += Math.abs(s.charAt(right) - t.charAt(right));

            while (currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
    public static void main(String[] args) {
        LeetCode1208 obj = new LeetCode1208();
        String s = "abcd";
        String t = "bcde";
        int maxCost = 3;
        int ans = obj.equalSubstring(s, t, maxCost);
        System.out.println(ans);
    }
}