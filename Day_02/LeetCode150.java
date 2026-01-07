import java.util.Stack;

public class LeetCode150 {
    public static void main(String[] args) {
        //String[] tokens = {"2", "1", "+", "3", "*"};
        String[] tokens = {"4","13","5","/","+"};
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^")) { // "+-*/^".contains(token) ---> another if condition
                int A = st.pop();
                int B = st.pop();
                switch (token) {
                    case "+":
                        st.push(B + A);
                        break;
                    case "-":
                        st.push(B - A);
                        break;
                    case "*":
                        st.push(B * A);
                        break;
                    case "/":
                        st.push(B / A);
                        break;
                    case "^":
                        st.push((int) Math.pow(B, A));
                        break;
                    default:
                        System.out.println("Condition Matched");
                }
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        System.out.println(st.peek());
    }
}
