
import java.util.HashSet;
import java.util.Set;

public class LeetCode3217 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;
        Set<Integer> toDelete = new HashSet<>();
        for (int num : nums) {
            toDelete.add(num);
        }
        while (current != null) {
            if (toDelete.contains(current.val)) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return dummy.next;

    }

    public static void main(String[] args) {
        LeetCode3217 obj = new LeetCode3217();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int[] nums = {1, 2, 3};
        ListNode ans = obj.modifiedList(nums, list);
        while (ans != null) {
            System.err.print(ans.val + "->");
            ans = ans.next;
        }
    }
}
