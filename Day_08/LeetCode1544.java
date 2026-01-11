import java.util.Stack;

public class LeetCode1544 {
    public static String makeGood(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(!st.isEmpty() && ((int) s.charAt(i) - (int) st.peek() == 32 || (int) st.peek() - (int) s.charAt(i)  == 32)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
//        String test = makeGood("leEeetcode");
//        String test = makeGood("abBAcC");
        String test = makeGood("s");
        System.out.println(test);

    }
}
