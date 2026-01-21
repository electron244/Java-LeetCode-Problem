
public class LeetCode67 {

    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                carry += b.charAt(j) - '0';
                j--;
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a ="1010";
        String b ="1011";
        LeetCode67 obj = new LeetCode67();
        String ans = obj.addBinary(a, b);
        System.out.println(ans);
    }
}
