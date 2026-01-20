
public class LeetCode725 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode[] splitListToParts(ListNode head,int k) {
        int length = 0;
        ListNode ptr = head;
        while(ptr != null){
            length++;
            ptr = ptr.next;
        }
        ptr = head;
        ListNode[] result = new ListNode[k];
        int baseSize = length/k;
        int extraNodes = length%k;
        for(int i = 0;i<k;i++){
            result[i] = ptr;
            int partSize = baseSize;
            if(i<extraNodes){
                partSize++;
            }
            for(int j = 0;j<partSize-1;j++){
                if(ptr!=null){
                    ptr = ptr.next;
                }
            }
            if(ptr!=null){
                ListNode newPart = ptr.next;
                ptr.next = null;
                ptr = newPart;
            }
        }

        
        return result;   
    }

    public static void main(String[] args) {
        LeetCode725 obj = new LeetCode725();
        ListNode list = new ListNode(1,new ListNode(2,new ListNode(3)));
        int k = 5;
        ListNode[] ans = obj.splitListToParts(list, k);
        for(int i = 0; i < ans.length; i++){
            System.out.print("Part " + i + ": ");
            ListNode current = ans[i];
            while(current != null){
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
        
    }
}
