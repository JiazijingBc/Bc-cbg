public class LC922 {
    public int[] sortArrayByParityII(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if ((i % 2 == 0 && A[i] % 2 == 0) || (i % 2 != 0 && A[i] % 2 != 0)){
                continue;
            }else {
                for (int j = i+1;j < A.length;j++){
                    if ((j % 2 == 0 && A[j] % 2 == 0) || (j % 2 != 0 && A[j] % 2 != 0)){
                        continue;
                    }else {
                        if (A[j] % 2 == 0){
                            if (i % 2 == 0){
                                int res = A[i];
                                A[i] = A[j];
                                A[j] = res;
                            }
                        }else {
                            if (i % 2 != 0){
                                int res = A[i];
                                A[i] = A[j];
                                A[j] = res;
                            }
                        }
                    }
                }
            }
        }
        return A;
    }
    public int[] sortArrayByParityII1(int[] A) {
        int n = A.length;
        int j = 1;
        for (int i = 0; i < n; i=i+2) {
            if (A[i]%2 == 0){
                continue;
            }else {
                while (A[j] %2 == 1){
                    j += 2;
                }
                int res = A[i];
                A[i] = A[j];
                A[j] = res;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        LC922 lc922 = new LC922();
        int[] ints = lc922.sortArrayByParityII(new int[]{4,2,6,7,3,9,5,8});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
