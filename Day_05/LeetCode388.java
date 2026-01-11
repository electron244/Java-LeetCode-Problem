import java.util.Stack;

public class LeetCode388 {
    public static void main(String[] args) {
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int maxLen = 0;

        String[] line = input.split("\n");

        for(String ch : line){
            int depth = 0;
            while(ch.startsWith("\t")){
                depth++;
                ch = ch.substring(1);
            }

            while(stack.size() > depth + 1){
                stack.pop();
            }

            int curLen = stack.peek() + ch.length();

            if(ch.contains(".")){
                maxLen = Math.max(maxLen,curLen);
            }else{
                stack.push(curLen + 1);
            }
        }
        System.out.println(maxLen);
    }
}
