import java.util.*;

public class LeetCode1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        // Step 1: Map each element of arr2 to its index
        Map<Integer, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            orderMap.put(arr2[i], i);
        }

        // Step 2: Separate arr1 into "in arr2" and "not in arr2"
        List<Integer> inArr2 = new ArrayList<>();
        List<Integer> notInArr2 = new ArrayList<>();

        for (int num : arr1) {
            if (orderMap.containsKey(num)) {
                inArr2.add(num);
            } else {
                notInArr2.add(num);
            }
        }

        inArr2.sort((a, b) -> orderMap.get(a) - orderMap.get(b));

        Collections.sort(notInArr2);

        int[] result = new int[arr1.length];
        int index = 0;

        for (int num : inArr2) {
            result[index++] = num;
        }
        for (int num : notInArr2) {
            result[index++] = num;
        }

        return result;
    }

    
    public static void main(String[] args) {
        LeetCode1122 sol = new LeetCode1122();

        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};

        int[] output = sol.relativeSortArray(arr1, arr2);

        System.out.println("Output: " + Arrays.toString(output));
    }
}