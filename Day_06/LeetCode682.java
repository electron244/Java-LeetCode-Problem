import java.net.Inet4Address;
import java.util.Stack;

public class LeetCode682 {
    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        int[] s = new int[operations.length];
        int sum = 0;
        int i = 0;
        for(String ch : operations){
            switch (ch){
                case "+":s[i] = s[i-1]+s[i-2];i++;break;
                case "D": s[i] = 2*s[i-1];i++;break;
                case "C":i--;break;
                default:s[i++] = Integer.parseInt(ch);
            }
        }
        for(int k =0 ;k<i;k++) sum += s[k];
        System.out.println(sum);

    }
}
