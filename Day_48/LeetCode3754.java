public class LeetCode3754{
    public long sumAndMultiply(int n) {
        long x=0,s=0;
        for(char c : String.valueOf(n).toCharArray()){
            if(c!='0'){
                x = x*10 + c-'0';
                s+=c-'0';
            }
        }
        return x*s;
    }
    public static void main(String[] args){
        LeetCode3754 obj = new LeetCode3754();
        int n = 10203004;
        long ans = obj.sumAndMultiply(n);
        System.out.println(ans);
    }
}