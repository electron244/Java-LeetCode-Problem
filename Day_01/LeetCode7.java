public class LeetCode7 {
    public static void main(String[] args) {
        int x = 1234567;
        int rev = 0;
        int sign = x<0?-1:1;
        int num = Math.abs(x);
        while(num!=0){
            int digit = num%10;
            num = num/10;
            rev = rev*10 + digit;
            System.out.println(rev*sign);
        }
    }
}
