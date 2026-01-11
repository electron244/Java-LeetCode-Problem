import java.util.Stack;

public class LeetCode316 {
    public static void main(String[] args) {

        String s = "bcabc";
        Stack<Character> stack = new Stack<>();
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;

        }
        for (char c : s.toCharArray()) {
            freq[c - 'a']--;
            if (visited[c - 'a']) continue;
            while (!stack.isEmpty() &&
                    stack.peek() > c &&
                    freq[stack.peek() - 'a'] > 0) {

                char removed = stack.pop();
                visited[removed - 'a'] = false;
            }
            stack.push(c);
            visited[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        System.out.println(sb.toString());

    }
}
