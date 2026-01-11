import java.util.Stack;

public class LeetCode739 {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<temperatures.length ; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int prev = st.pop();
                ans[prev] = i-prev;
            }
            st.push(i);
        }
        for(int i : ans){
            System.out.print(i+",");
        }
    }
}
