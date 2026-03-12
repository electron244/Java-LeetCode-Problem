
import java.util.Stack;

public class LeetCode1717 {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return remove(s, "ab", x) + remove(remaining, "ba", y);
        } else {
            return remove(s, "ba", y) + remove(remaining, "ab", x);
        }

    }

    String remaining;

    private int remove(String s, String target, int score) {

        Stack<Character> stack = new Stack<>();
        int points = 0;

        for (char c : s.toCharArray()) {

            if (!stack.isEmpty() &&
                    stack.peek() == target.charAt(0) &&
                    c == target.charAt(1)) {

                stack.pop();
                points += score;

            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : stack)
            sb.append(c);

        remaining = sb.toString();

        return points;
    }

    public static void main(String[] args) {
        LeetCode1717 obj = new LeetCode1717();
        String s = "cdbcbbaaabab";
        int x = 4;
        int y = 5;
        int ans = obj.maximumGain(s, x, y);
        System.out.println(ans);
    }
}
