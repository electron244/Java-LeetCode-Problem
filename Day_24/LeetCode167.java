public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int currSum = numbers[left] + numbers[right];
            if (currSum == target) {
                return new int[]{ left + 1, right + 1 };
            } else if (currSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        LeetCode167 obj = new LeetCode167();
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] ans = obj.twoSum(arr, target);
        for (int i : ans) {
            System.out.println(i);
        }

    }
}