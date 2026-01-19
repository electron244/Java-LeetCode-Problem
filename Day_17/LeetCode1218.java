
public class LeetCode1218 {

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

    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode list = dummy;
        ListNode current = head.next;
       
        int sum = 0;
        while (current != null) {
            if (current.val == 0) {
                ListNode newNode = new ListNode(sum);
                list.next = newNode;
                list = newNode;
                sum = 0;
            } else {
                sum += current.val;

            }
            current = current.next;

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        LeetCode1218 obj = new LeetCode1218();
        ListNode list = new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0))))))));
        ListNode ans = obj.mergeNodes(list);
        while (ans != null) {
            System.out.print(ans.val + "->");
            if (ans.next == null) {
                System.out.print("null");
            }
            ans = ans.next;
        }
    }
}
