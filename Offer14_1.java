public class Offer14_1 {
    public int cuttingRope(int n) {
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        int a = 1;
        while (n>4){
            n -= 3;
            a *=3;
        }
        a*=n;
        return a;
    }

    public static void main(String[] args) {
        System.out.println((new Offer14_1()).cuttingRope(10));
    }
}

