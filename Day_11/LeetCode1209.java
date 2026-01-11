import java.util.Stack;

class LeetCode1209 {
    public String removeDuplicates(String s, int k) {
        class Pair {
            char ch;
            int count;

            Pair(char ch, int count) {
                this.ch = ch;
                this.count = count;
            }
        }

        Stack<Pair> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (st.isEmpty() || st.peek().ch != ch) {
                st.push(new Pair(ch, 1));
            } else {
                st.peek().count++;
                if (st.peek().count == k) {
                    st.pop();
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (Pair p : st) {
            for (int i = 0; i < p.count; i++) {
                res.append(p.ch);
            }
        }
        return res.toString();

    }

    public static void main(String[] args) {
        LeetCode1209 obj = new LeetCode1209();
        String ans = obj.removeDuplicates("deeedbbcccbdaa", 3);
        System.out.println(ans);
    }
}