import java.util.Stack;

public class LeetCode735 {
    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        Stack<Integer> st = new Stack<>();
        for(int ast:asteroids){
            boolean collision = true;
            while(collision && ast<0 && !st.isEmpty() && st.peek() > 0){
                if(Math.abs(ast) > st.peek()){
                    st.pop();
                } else if (Math.abs(ast) == st.peek()) {
                    st.pop();
                    collision = false;
                }else{
                    collision = false;
                }
            }
            if(collision) st.push(ast);
        }
        int[] arr = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            arr[i] = st.get(i);
        }
        
        for(int i : arr){
            System.out.println(i);
        }

    }
}
