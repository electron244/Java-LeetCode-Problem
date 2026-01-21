
public class LeetCode2095 {

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

    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        if (head == null || head.next == null) {
            return null;
        }
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
        LeetCode2095 obj = new LeetCode2095();
        ListNode list = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(6)))))));
        ListNode ans = obj.deleteMiddle(list);
        while (ans != null) {
            System.out.print(ans.val + "->");
            if (ans.next == null) {
                System.out.print("null");
            }
            ans = ans.next;
        }
    }
}
