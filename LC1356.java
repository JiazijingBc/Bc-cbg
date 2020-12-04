import java.util.*;

public class LC1356 {
    public int[] sortByBits(int[] arr) {
        int[] ints = new int[10001];
        ArrayList arrayList = new ArrayList<Integer>();
        for (int i : arr) {
            arrayList.add(i);
            ints[i] = helper(i);
        }
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                if (ints[x]!=ints[y]){
                    return ints[x]-ints[y];
                }else {
                    return x-y;
                }
            }
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) arrayList.get(i);
        }
        return arr;
    }
    public int helper(int a){
        int count =0;
        while (a != 0){
            count+=a%2;
            a/=2;
        }
        return count;
    }
}
