import java.util.Stack;

public class Offer06 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode res = head;
        while (res != null){
            stack.push(head.val);
            res=res.next;
        }


        int[] ints = new int[stack.size()];
        for(int i = 0;i < ints.length;i++){
            ints[i] = stack.pop();
        }
        return ints;
    }
}
