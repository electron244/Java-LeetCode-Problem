public class LeetCode414 {

    public int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;
        
        for (int num : nums) {
            // Skip if we've already seen this number
            if ((first != null && num == first) || 
                (second != null && num == second) || 
                (third != null && num == third)) {
                continue;
            }
            
            // Update the three maximums
            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            } else if (second == null || num > second) {
                third = second;
                second = (long) num;
            } else if (third == null || num > third) {
                third = (long) num;
            }
        }
        
        // If third max exists, return it; otherwise return first max
        return third != null ? third.intValue() : first.intValue();
    }
    public static void main(String[] args) {
        LeetCode414 obj = new LeetCode414();
        int[] nums = {3,2,1};
        int ans = obj.thirdMax(nums);
        System.out.println(ans);
    }
}
