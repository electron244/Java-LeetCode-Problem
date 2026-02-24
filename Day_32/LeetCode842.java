public class LeetCode842 {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 0, hi = arr.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        LeetCode842 obj = new LeetCode842();
        int[] arr = {0,2,1,0};
        int ans = obj.peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
}