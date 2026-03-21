import java.util.HashSet;
import java.util.Set;

public class LeetCode128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int maxLength = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentlength = 1;

                while(set.contains(currentNum+1)){
                    currentlength++;
                    currentNum++;
                }
                maxLength = Math.max(maxLength,currentlength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LeetCode128 obj = new LeetCode128();
        int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        int ans = obj.longestConsecutive(nums);
        System.out.println(ans);
    }
}