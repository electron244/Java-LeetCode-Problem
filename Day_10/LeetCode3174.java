import java.util.Stack;

public class LeetCode3174 {
    public static void main(String[] args) {
        String s = "abc4";
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        StringBuilder str = new StringBuilder();
        for (char ch : st) {
            str.append(ch);
        }
        System.out.println(str.toString());
    }
}
