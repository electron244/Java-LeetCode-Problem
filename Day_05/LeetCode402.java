import java.util.Stack;

public class LeetCode402 {
    public static void main(String[] args) {
        String num = "10200";
        int k = 1;
        Stack<Character> st = new Stack<>();
        for (char digit : num.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
                st.pop();
                k--;
            }
            st.push(digit);
        }

        // If k is still remaining, remove last chars
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Build the result
        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // If empty return "0"
        if (sb.length() == 0) System.out.println("0");
        System.out.println(sb.toString());
    }
}
