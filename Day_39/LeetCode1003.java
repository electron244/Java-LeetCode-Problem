import java.util.Stack;

public class LeetCode1003 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            stack.push(ch);
            if (stack.size() >= 3) {
                char third = stack.pop();
                char second = stack.pop();
                char first = stack.pop();

                if (!(first == 'a' && second == 'b' && third == 'c')) {
                    stack.push(first);
                    stack.push(second);
                    stack.push(third);
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        LeetCode1003 obj = new LeetCode1003();
        String s = "aabcbc";
        boolean ans = obj.isValid(s);
        System.out.println(ans);
    }
}