
class LeetCode203 {

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

    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0), curr = temp;
        temp.next = head;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return temp.next;
    }
    
    public static void main(String[] args) {
        LeetCode203 obj = new LeetCode203();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3))));
        ListNode ans = obj.removeElements(list, 6);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
