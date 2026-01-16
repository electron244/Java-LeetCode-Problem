
public class LeetCode141 {

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

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null) {
            return false;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode141 obj = new LeetCode141();
        ListNode list = new ListNode(1, new ListNode(2));
        boolean ans = obj.hasCycle(list);
        System.err.println(ans);
    }
}
