import java.util.ArrayList;
import java.util.List;

class LeetCode1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int targetIndex = 0;
        
        for (int current = 1; current <= n && targetIndex < target.length; current++) {
            result.add("Push");
            
            if (current == target[targetIndex]) {
                targetIndex++;
            } else {
                result.add("Pop");
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        LeetCode1441 solution = new LeetCode1441();
        
        // Test case 1
        int[] target1 = {1, 3};
        int n1 = 3;
        System.out.println(solution.buildArray(target1, n1));
        // Output: [Push, Push, Pop, Push]
        
        // Test case 2
        int[] target2 = {1, 2, 3};
        int n2 = 3;
        System.out.println(solution.buildArray(target2, n2));
        // Output: [Push, Push, Push]
        
        // Test case 3
        int[] target3 = {1, 2};
        int n3 = 4;
        System.out.println(solution.buildArray(target3, n3));
        // Output: [Push, Push]
    }
}