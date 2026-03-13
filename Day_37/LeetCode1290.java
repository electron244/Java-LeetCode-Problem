
public class LeetCode1290 {
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

    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        StringBuilder res = new StringBuilder();
        while (curr != null) {
            res.append((char) (curr.val + '0'));
            curr = curr.next;
        }

        return (Integer.parseInt(res.toString(), 2));
    }

    public static void main(String[] args) {
        LeetCode1290 obj = new LeetCode1290();
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        int ans = obj.getDecimalValue(head);
        System.out.println(ans);
    }
}