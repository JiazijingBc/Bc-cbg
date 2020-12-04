public class LC204 {
    public int countPrimes(int n) {
        if (n<2){
            return 0;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (i == 2){
                count ++;
            }
            else if(i!=2 && i%2 == 0){
                continue;
            }else {
                if (helper(i)){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean helper(int a){
        for (int i = 2; i < a; i++) {
            if (a%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LC204 lc204 = new LC204();
        System.out.println(lc204.countPrimes(499979));
    }
}
