import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> table = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            table.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();

        for (int i = 0; i < list2.length; i++) {
            if (table.containsKey(list2[i])) {
                int sum = i + table.get(list2[i]);
                if (sum < minSum) {
                    minSum = sum;
                    res.clear();
                    res.add(list2[i]);
                } else if (minSum == sum) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        LeetCode599 obj = new LeetCode599();
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] ans = obj.findRestaurant(list1, list2);
        for(String el : ans){
            System.out.println(el);
        }
    }
}
