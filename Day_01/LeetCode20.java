import java.util.Stack;

public class LeetCode20 {
    public static void main(String[] args) {
        boolean result = true;
        String s = "()[]{}";
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                ch.push(s.charAt(i));
                //System.out.println(ch);
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (ch.isEmpty()) {
                    result = false;
                }
                if ((s.charAt(i) == ')' && ch.peek() == '(') || (s.charAt(i) == ']' && ch.peek() == '[') || (s.charAt(i) == '}' && ch.peek() == '{')) {
                    ch.pop();
                } else {
                    result = false;
                }
            }
        }

        if (ch.isEmpty()) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
    }
}
