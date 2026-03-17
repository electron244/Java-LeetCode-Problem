public class LeetCode61 {
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

    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        if (head == null || head.next == null || k == 0)
            return head;
        int n = 1;
        while (tail.next != null) {
            n++;
            tail = tail.next;
        }
        k = k % n;
        if (k == 0) {
            return head;
        }
        tail.next = head;
        ListNode newTail = head;
        for (int i = 0; i < n - k - 1; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        LeetCode61 obj = new LeetCode61();
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(2)));
        int k = 4;
        ListNode ans = obj.rotateRight(head, k);
        while (ans.next != null) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
}
