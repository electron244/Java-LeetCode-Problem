public class LeetCode13 {
    public static int values(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String s = "III";
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currValue = values(s.charAt(i));
            if (i + 1 < s.length() && currValue < values(s.charAt(i + 1))) {
                total -= currValue;
            } else {
                total += currValue;
            }
        }
        System.out.println(total);
    }
}
