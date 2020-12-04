public class Offer19 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode a = head;

        if (a.val == val){
            head = head.next;
            return head;
        }
        while(a.next.val != val){
            a = a.next;
        }

        a.next = a.next.next;

        return head;
    }
}
