import java.util.Stack;

public class LeetCode946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            st.push(pushed[i]);
            while (!st.isEmpty() && st.peek() == popped[j] && j < popped.length) {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        LeetCode946 obj = new LeetCode946();
        int[] pushed = {1,2,3,4,5};
//        int[] popped = {4,5,3,2,1};
        int[] popped = {4,3,5,1,2};
        boolean ans = obj.validateStackSequences(pushed,popped);
        System.out.println(ans);
    }
}

