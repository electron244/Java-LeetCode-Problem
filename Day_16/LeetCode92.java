
import java.util.Stack;

public class LeetCode92 {

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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        if (head == null || left == right) {
            return head;
        }
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode current = prev.next;
        Stack<ListNode> st = new Stack<>();
        for (int i = left; i <= right; i++) {
            st.push(current);
            current = current.next;
        }

        ListNode connect = prev;
        while (!st.isEmpty()) {
            ListNode node = st.pop();
            connect.next = node;
            connect = node;
        }
        connect.next = current;
        return dummy.next;
    }

    public static void main(String[] args) {
        LeetCode92 obj = new LeetCode92();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int left = 2;
        int right = 4;
        ListNode ans = obj.reverseBetween(list, left, right);
        while (ans != null) {
            System.out.print(ans.val + "->");
            if (ans.next == null) {
                System.out.print("null");
            }

            ans = ans.next;
        }
    }
}
