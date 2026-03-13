import java.util.HashSet;
import java.util.Set;

public class LeetCode817 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int count = 0;
        while (head != null) {
            if (set.contains(head.val) &&
               (head.next == null || !set.contains(head.next.val))) {
                count++;
            }
            head = head.next;
        }
        return count;

    }

    public static void main(String[] args) {
        LeetCode817 obj = new LeetCode817();
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
        int[] nums = { 0, 1, 3 };
        int ans = obj.numComponents(head, nums);
        System.out.println(ans);
    }
}
