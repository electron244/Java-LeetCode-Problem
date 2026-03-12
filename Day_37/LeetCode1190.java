
import java.util.*;

public class LeetCode1190 {
    public String reverseParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            List<Character> list = new ArrayList<>();
            if(ch == ')'){
                while(stack.peek() !='('){
                    list.add(stack.pop());
                }
                stack.pop();
                for(char c : list){
                    stack.push(c);
                }
            }else{
                stack.push(ch);
            }
        }

        for(char ch : stack) res.append(ch);
        return res.toString();
    }

    public static void main(String[] args) {
        LeetCode1190 obj = new LeetCode1190();
        String s = "(abcd)";
        String ans = obj.reverseParentheses(s);
        System.out.println(ans);
    }
}