import java.util.Stack;

public class LeetCode1475 {
    public static void main(String[] args) {

        int[] price = {8, 4, 6, 2, 3};
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < price.length; i++) {

            while (!st.isEmpty() && price[i] <= price[st.peek()]) {
                int idx = st.pop();
                price[idx] = price[idx] - price[i];
            }

            st.push(i);
        }

        for (int p : price) {
            System.out.print(p + " ");
        }
    }
}
