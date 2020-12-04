public class LC147 {
    public ListNode insertionSortList(ListNode head) {
        if (head==null){return null;}
        ListNode i = head;
        ListNode j = head;
        int flag = 1;
        while (i!=null && i.next!=null){
            if (i.next.val<i.val){
                ListNode p = i.next;
                while (j.next!=null){
                    if(j == head && j.val>p.val){

                        i.next = i.next.next;
                        // System.out.println(i.next.val);
                        // System.out.println(p.val);
                        p.next = j;
                        head = p;
                        j = head;
                        flag = 0;
                        break;
                    }
                    else if (j.val <= p.val && j.next.val > p.val){
                        i.next = i.next.next;
                        p.next = j.next;
                        j.next = p;
                        j = head;
                        flag = 0;
                        break;
                    }else {
                        j = j.next;
                    }
                }
            }
            if (flag == 0){
                flag = 1;
            }else{
                i = i.next;
            }
        }
        return head;
    }
}
