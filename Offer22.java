public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode a,b;
        a = head;
        b = head;
        for(int i=0;i<k-1;i++){
            b=b.next;
        }
        while (b.next!=null){
            a=a.next;
            b=b.next;
        }



        return a;
    }


}
