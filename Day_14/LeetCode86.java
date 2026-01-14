
class LeetCode86 {

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

    public ListNode partition(ListNode head, int n) {
        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode after = afterHead;
        ListNode current = head;
        while (current != null) {
            if (current.val < n) {
                before.next = current;
                before = before.next;
            } else {
                after.next = current;
                after = after.next;
            }
            after.next = null;
            before.next = afterHead.next;

        }
        return beforeHead.next;
    }

    public static void main(String[] args) {
        LeetCode86 obj = new LeetCode86();
        ListNode list = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        int n = 3;
        ListNode ans = obj.partition(list, n);
        while (ans != null) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
}
