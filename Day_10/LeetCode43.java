public class LeetCode43{

    public static String multiply(String num1, String num2) {

        // Edge case
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n1 = num1.length();
        int n2 = num2.length();

        // Result array
        int[] res = new int[n1 + n2];

        // Multiply digits from right to left
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + res[i + j + 1];

                res[i + j + 1] = sum % 10;     // store digit
                res[i + j] += sum / 10;        // store carry
            }
        }

        // Convert array to string
        StringBuilder sb = new StringBuilder();
        for (int num : res) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    // Main method
    public static void main(String[] args) {

        String num1 = "123";
        String num2 = "456";

        String result = multiply(num1, num2);

        System.out.println("Result: " + result); // Expected: 56088
    }
}
