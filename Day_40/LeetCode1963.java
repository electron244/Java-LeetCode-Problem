public class LeetCode1963 {

    public int minSwaps(String s) {
        int open = 0;
        int unmatched = 0;
        for(char ch : s.toCharArray()){
            if(ch == '[') open ++;
            else{
                if(open>0) open--;
                else unmatched++;
            }
        }
        return (unmatched+1)/2;
    }

    public static void main(String[] args) {
        LeetCode1963 obj = new LeetCode1963();
        int ans = obj.minSwaps("]]][[[");
        System.out.println(ans);
    }
}