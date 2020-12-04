import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC143 {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        Deque<ListNode> deque = new LinkedList<>();
        ListNode p = new ListNode(-1);
        p.next = head;
        while (p.next != null){
            deque.add(p.next);
            p = p.next;
        }
        int flag = 0;
        deque.removeFirst();
        while (deque.size()!=0){
            if(flag == 0){
                head.next = deque.pollLast();
                head = head.next;
                flag = 1;
            }else {
                head.next = deque.pollFirst();
                head = head.next;
                flag = 0;
            }
        }
        head.next = null;
    }
}
