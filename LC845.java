import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LC845 {
    public int longestMountain(int[] A) {
        if(A.length<3){
            return 0;
        }
        LinkedList<Integer> ans = new LinkedList<Integer>();
        for (int i = 1; i < A.length-1; i++) {
            if (A[i-1] >= A[i] && A[i+1]>A[i]){
                ans.add(i);
            }else if (A[i-1] > A[i] && A[i+1]>=A[i]){
                ans.add(i);
            }
        }
        if (ans.size()==0) {
            for (int i = 1; i < A.length-1; i++) {
                if (A[i-1] < A[i] && A[i+1] < A[i]){
                    return A.length;
                }
            }
            return 0;
        }
        for (int j = A.length-2;j>ans.get(ans.size()-1);j--){
            if (A[j-1] < A[j] && A[j+1] < A[j]){
                ans.addLast(A.length-1);
            }
        }
        for (int i = 1;i<ans.get(0);i++){
            if (A[i-1] < A[i] && A[i+1] < A[i]){
                ans.addFirst(0);
            }
        }
        for (Integer an : ans) {
            System.out.println(an);
        }
        int ans1 = 0;
        for (int i = 1; i < ans.size(); i++) {
            int res = ans.get(i) - ans.get(i-1) +1;
            if (res>ans1){
                ans1 = res;
            }
        }
        return ans1;
    }
    public int longestMountain1(int[] A) {
        if(A.length<3){
            return 0;
        }
        LinkedList<Integer> ans = new LinkedList<Integer>();
        for (int i = 1; i < A.length-1; i++) {
            if (A[i-1] < A[i] && A[i+1] < A[i]){
                ans.add(i);
            }
        }
        if (ans.size()==0) {
            return 0;
        }
        int ans1 = 0;
        for (Integer an : ans) {
            int res = 0;
            int left = an;
            int right = an;
            while (left-1>=0 && A[left-1]<A[left]){
                left --;
            }
            while (right+1<=A.length-1 && A[right+1]<A[right]){
                right ++;
            }
            res = right-left+1;
            if (res>ans1){
                ans1 = res;
            }
        }
        return ans1;
    }
    public static void main(String[] args) {
//        LC845 lc845 = new LC845();
//        System.out.println(lc845.longestMountain1(new int[]{1,1,0,0,1,0}));
        StringBuffer a = null;
        a.append(1);

    }
}
