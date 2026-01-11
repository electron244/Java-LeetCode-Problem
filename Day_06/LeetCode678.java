public class LeetCode678 {
    public static void main(String[] args) {
        String s = "(*))";
        int left = 0;
        int right = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                left++;
                right++;
            } else if (ch == ')') {
                left--;
                right--;
            } else {
                left--;
                right++;
            }
            if (left < 0) left = 0;
            if (right < 0) System.out.println(false);
        }
        if (left == 0) System.out.println(true);
    }
}
