import java.util.HashSet;

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int left = 0;
        int right = 0;
        int max_len = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max_len = Math.max(max_len, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max_len;
    }

    public static void main(String[] args) {
        LeetCode3 obj = new LeetCode3();
        int ans = obj.lengthOfLongestSubstring("");
        System.out.println(ans);
    }
}
