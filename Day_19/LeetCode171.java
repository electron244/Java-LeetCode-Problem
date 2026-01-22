public class LeetCode171 {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(int i = 0;i<columnTitle.length();i++){
            char a = columnTitle.charAt(i);
            int value = a-'A' + 1;
            ans = ans * 26 +value;
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode171 obj = new LeetCode171();
        String st = "AB";
        int ans = obj.titleToNumber(st);
        System.out.println(ans);
    }
}
