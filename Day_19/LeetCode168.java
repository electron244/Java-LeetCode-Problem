public class LeetCode168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            res.insert(0,(char) ((columnNumber%26) + 'A'));
            columnNumber /= 26;
        }
        return res.toString();
    }
    public static void main(String[] args) {
        LeetCode168 obj = new LeetCode168();
        int num= 28;
        String ans=obj.convertToTitle(num);
        System.out.println(ans);
    }
}
