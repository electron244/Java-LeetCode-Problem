
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LeetCode1249 {

    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        Set<Integer> idx = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else if (s.charAt(i) == ')') {
                if (st.isEmpty()) {
                    idx.add(i);
                } else {
                    st.pop();
                }
            }
        }
        while (!st.isEmpty()) {
            idx.add(st.pop());
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!idx.contains(i)) {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        LeetCode1249 obj = new LeetCode1249();
        String s = "lee(t(c)o)de)";
        String ans = obj.minRemoveToMakeValid(s);
        System.out.println(ans);
    }
}
