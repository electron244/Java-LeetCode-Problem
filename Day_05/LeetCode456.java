import java.util.Stack;

public class LeetCode456 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Stack<Integer> st = new Stack<>();
        int third = Integer.MIN_VALUE;
        for(int i = nums.length - 1;i>=0;i--){
            if(nums[i] < third) System.out.println(true);
            while(!st.isEmpty() && nums[i] > st.peek()){
                third = st.pop();
            }
            st.push(nums[i]);
        }
        System.out.println(true);
    }
}
