public class LC142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                ListNode ptr1 = head;
                ListNode ptr2 = fast;
                while (true){
                    if (ptr1 == ptr2){
                        return ptr1;
                    }
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
            }
        }
        return null;
    }
}
