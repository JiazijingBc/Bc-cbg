public class LC941 {
    public boolean validMountainArray(int[] A) {
        if (A.length<3){
            return false;
        }
        int i = 0;
        boolean flag = true;
        boolean ans = true;
        int top = 0;
        while (i<A.length-1){
            if (flag){
                if (A[i]>A[i+1]){
                    flag = false;
                    top = A[i];
                }else if (A[i] == A[i+1]){
                    ans = false;
                    break;
                }
            }else {
                if (A[i]<=A[i+1]){
                    ans = false;
                    break;
                }
            }
            i++;
        }
        if(top > A[0] && top >A[A.length-1]){
            return ans;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        LC941 lc941 = new LC941();
        System.out.println(lc941.validMountainArray(new int[]{1,2,3,4}));
    }
}
