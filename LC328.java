public class LC328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode odd = head;
        ListNode odd1 = odd;
        ListNode even = head.next;
        ListNode even1 = even;

        while (even!=null&&even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next=odd.next;
            even = even.next;
        }
        odd.next = even1;

        return odd1;
    }
}
