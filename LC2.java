public class LC2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode ans1 = ans;

        int flag = 0;
        while (l1 != null || l2 != null ){
            int res = 0;
            if(l1 == null){
                res = l2.val+flag;
            }else if(l2 == null){
                res = l1.val+flag;
            }else {
                res = l1.val+l2.val+flag;
            }
            if (res>=10){
                ListNode listNode = new ListNode(res - 10);
                ans1.next = listNode;
                ans1 = ans1.next;
                flag = 1;
            }else {
                ListNode listNode = new ListNode(res);
                ans1.next = listNode;
                ans1 = ans1.next;
                flag = 0;
            }
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(flag == 1){
            ListNode listNode = new ListNode(flag);
            ans1.next = listNode;
        }
        return ans.next;
    }
}
