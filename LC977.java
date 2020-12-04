public class LC977 {
    public int[] sortedSquares(int[] A) {
        int left = 0;
        int right = A.length-1;
        int[] ans = new int[A.length];
        int i = A.length-1;
        while (left<=right){
            if(Math.abs(A[right])>Math.abs(A[left])){
                ans[i] = (Math.abs(A[right]))*(Math.abs(A[right]));
                right -= 1;
                i -= 1;
            }else {
                ans[i] = (Math.abs(A[left]))*(Math.abs(A[left]));
                i-=1;
                left+=1;
            }
        }
        return ans;
    }
}
