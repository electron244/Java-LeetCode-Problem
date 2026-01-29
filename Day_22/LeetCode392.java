public class LeetCode392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        LeetCode392 obj = new LeetCode392();
        String s = "ace";
        String t = "abcde";
        boolean ans = obj.isSubsequence(s, t);
        System.out.print(ans);
    }
}