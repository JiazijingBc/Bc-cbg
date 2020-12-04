public class Offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while (a != b){
            if (a.next == null){
                a.next = headB;
            }
            if (b.next == null){
                b.next = headA;
            }

            a = a.next;
            b = b.next;

        }
        return a;
    }

}
