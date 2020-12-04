public class Offer17 {
    public int[] printNumbers(int n) {
        int i = (int) Math.pow(10,n)-1;
        int[] ab = new int[i];
        for (int j = 0; j<i; j++){
            ab[j]=j+1;
        }
        return ab;
    }
}
