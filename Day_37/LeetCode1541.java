import java.util.*;
public class LeetCode1541 {
    public int minInsertions(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    count++;
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    count++;
                }
            }
        }
        count += stack.size() * 2;
        return count;
    }

    public static void main(String[] args) {
        LeetCode1541 obj = new LeetCode1541();
        String s = "(()))";
        int ans = obj.minInsertions(s);
        System.out.println(ans);
    }
}