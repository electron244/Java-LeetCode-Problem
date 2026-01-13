
public class LeetCode328 {

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

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }

    public static void main(String[] args) {
        LeetCode328 obj = new LeetCode328();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5)))));

        ListNode ans = obj.oddEvenList(list);
        while(ans != null){
            System.err.print(ans.val+"->");
            ans = ans.next;
        }

    }
}
