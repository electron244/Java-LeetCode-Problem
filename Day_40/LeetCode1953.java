import java.util.Stack;

public class LeetCode1953 {
    public int minimumDeletions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'b')
                stack.push(ch);
            else {
                if (!stack.isEmpty() && stack.peek() == 'b') {
                    stack.pop();
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode1953 obj = new LeetCode1953();
        String s = "aababbab";
        int ans = obj.minimumDeletions(s);
        System.out.println(ans);
    }
}
