import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LC234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = list.size()-1;
        while (left<right){
            if (!list.get(left).equals(list.get(right)) ){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
}
