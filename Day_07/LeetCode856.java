import java.util.Stack;

public class LeetCode856 {
    public static void main(String[] args) {
        String s = "()";
        Stack<Integer> st = new Stack<>();
        int score = 0;
        st.push(0);
        for(char ch : s.toCharArray()){
            if(ch=='('){
                st.push(0);
            }else{
                int value = st.pop();
                if (value == 0) {
                    score = 1;
                }else{
                    score = 2*value;
                }
                int top = st.peek();
                st.push(top + score);
            }
        }
        System.out.println(st.peek());

    }
}
