public class LeetCode66 {
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        for(int i = digits.length - 1 ; i>=0;i--){
            digits[i] += 1;
            if(digits[i] < 10){
                for(int ch : digits) System.out.println(ch);
            }
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        for(int ch : result) System.out.println(ch);
    }
}
