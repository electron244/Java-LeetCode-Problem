
public class LeetCode125 {

    public boolean isPlaindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        LeetCode125 obj = new LeetCode125();
        String s = "A man, a plan, a canal: Panama";
        boolean ans = obj.isPlaindrome(s);
        System.out.print(ans);
    }
}
