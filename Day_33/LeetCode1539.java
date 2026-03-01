public class LeetCode1539 {
    public int findKthPositive(int[] arr, int k) {
        for (int num : arr) {
            if (num <= k)
                k++; 
            else
                break;
        }
        return k;
    }

    public static void main(String[] args) {
        LeetCode1539 obj = new LeetCode1539();
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        int ans = obj.findKthPositive(arr, k);
        System.out.println(ans);
    }
}
