
public class LeetCode160 {

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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptA = headA;
        ListNode ptB = headB;
        if (headA == null || headB == null) {
            return null;
        }
        while (ptA != ptB) {
            ptA = (ptA == null) ? headB : ptA.next;
            ptB = (ptB == null) ? headA : ptB.next;
        }
        return ptA;
    }

    public static void main(String[] args) {
        LeetCode160 obj = new LeetCode160();
        ListNode listA = new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5)))));
        ListNode listB = new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))));
        ListNode ans = obj.getIntersectionNode(listA, listB);
        while (ans != null) {
            System.out.print(ans.val + "->");
            if (ans.next == null) {
                System.out.print("null");
            }
            ans = ans.next;
        }

    }
}
