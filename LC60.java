import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LC60 {
    public String getPermutation(int n, int k) {
        Queue<Integer> queue = new LinkedList();
        for(int i = 1;i<=n;i++){
            queue.add(i);
        }
        String ans = "";
        int flag = n-1;
        while (k >= 0 && queue.size()!=0){
            if (k == 0){
                for (Integer num : queue) {
                    ans += queue.remove(num);
                    System.out.println(ans);
                }
            }else {
                int a = k / helper(flag);
                k = k % helper(flag);

                Iterator<Integer> iterator = queue.iterator();
                while (iterator.hasNext()){
                    Integer next = iterator.next();
                    if (next == a){
                        ans += queue.element();
                        iterator.remove();
                        System.out.println(ans);
                        break;
                    }
                }

//                int i = 0;
//                for (Integer num : queue) {
//                    i = i+1;
//                    if (i == a){
//                        ans += queue.remove(num);
//                    }
//                }
            }
        }
        return ans;
    }
    public int helper(int n){
        if (n==1){
            return 1;
        }
        return n * helper(n-1);
    }

    public static void main(String[] args) {
        LC60 lc60 = new LC60();
        System.out.println(lc60.getPermutation(4, 9));
    }
}
