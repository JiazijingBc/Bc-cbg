public class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode pre = new ListNode(0); // 增加头节点，防止后续操作的空指针异常
        pre.next = head;
        ListNode fast = pre;
        ListNode slow = pre;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast !=null && fast.next!= null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
