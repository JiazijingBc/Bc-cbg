public class LC24 {
    public ListNode swapPairs(ListNode head) {
        ListNode a = new ListNode(0);
        a.next = head;
        ListNode c = a;
        while (c.next !=null && c.next.next!=null){
            ListNode res = c.next;
            c.next = c.next.next;
            res.next = c.next.next;
            c.next.next = res;
            c = c.next.next;
        }


        return a.next;
    }
}
