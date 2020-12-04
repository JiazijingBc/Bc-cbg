public class Offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a = new ListNode(0);
        ListNode b = a;
        while (l1!=null &&l2!=null){
            if(l1.val>=l2.val){
                a.next=l2;
                l2=l2.next;
            }
            else {
                a.next=l1;
                l1=l1.next;
            }
            a = a.next;
        }
        if (l1==null){
            a.next=l2;
        }
        else {
            a.next=l1;
        }
        return b.next;
    }

}
