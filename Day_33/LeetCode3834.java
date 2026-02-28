import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode3834{
        public List<Long> mergeAdjacent(int[] nums) {
            Stack<Long> st = new Stack<>();
            for(int i : nums){
                long current = i;
                while(!st.isEmpty() && st.peek() == current){
                    current = current+st.pop();
                }
                st.push(current);
            }
            return new ArrayList<>(st);
        }
    public static void main(String[] args) {
        LeetCode3834 obj = new LeetCode3834();
        int[] nums  = {3,1,1,2};
        List<Long> ans = obj.mergeAdjacent(nums);
        System.out.println(ans);
    }
}