import java.util.Stack;

public class LeetCode1047 {
    public static String removeDuplicates(String s) {
        Stack<Character> arr = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if((!arr.isEmpty()) && (arr.peek() == s.charAt(i))){
                arr.pop();
            }else{
                arr.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        while(!arr.isEmpty()){
            result.append(arr.pop());
        }

        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String test = removeDuplicates("abbaca");
        System.out.println(test);
    }
}
