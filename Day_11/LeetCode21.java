public class LeetCode21 {
    public class ListNode {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                ListNode newNode = new ListNode(temp1.val);
                temp.next = newNode;
                temp = newNode;
                temp1 = temp1.next;
            } else {
                ListNode newNode = new ListNode(temp2.val);
                temp.next = newNode;
                temp = newNode;
                temp2 = temp2.next;
            }
        }
        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return head.next;
    }

    public static void main(String[] args) {
        LeetCode21 obj = new LeetCode21();

        ListNode l1 = obj.new ListNode(1);
        l1.next = obj.new ListNode(2);
        l1.next.next = obj.new ListNode(4);
        l1.next.next.next = obj.new ListNode(6);



        ListNode l2 = obj.new ListNode(1);
        l2.next = obj.new ListNode(3);
        l2.next.next = obj.new ListNode(4);

        ListNode result = obj.mergeTwoLists(l1, l2);


        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}
