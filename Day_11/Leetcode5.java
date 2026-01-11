public class Leetcode5 {
    public String longestPalindrome(String s) {
        if (s.length() <= 2) return s;
        int start = 0;
        int max_len = 0;
        for (int i = 0; i < s.length(); i++) {

            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int curr_len = Math.max(len1, len2);
            if (curr_len > max_len) {
                max_len = curr_len;
                start = i - (curr_len - 1) / 2;
            }
        }
        return s.substring(start, start + max_len);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while ((left >= 0 && right < s.length()) && (s.charAt(left) == s.charAt(right))) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        Leetcode5 obj = new Leetcode5();
        String ans = obj.longestPalindrome("xabaxw");
        System.out.println(ans);
    }
}
