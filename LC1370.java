import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LC1370 {
    public String sortString(String s) {
        StringBuilder ans=new StringBuilder();
        int[] ints = new int[26];
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            ints[aChar-'a'] ++;
        }
        while (ans.length()<s.length()){
            for (int i = 0; i < ints.length; i++) {
                if (ints[i]>0){
                    ans.append((char)(i+'a'));
                    ints[i]--;
                }
            }for (int i =ints.length-1;i>=0;i--){
                if (ints[i]>0){
                    ans.append((char)(i+'a'));
                    ints[i]--;
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        LC1370 lc1370 = new LC1370();
        String aaabbbccc = lc1370.sortString("aaabbbccc");
        System.out.println(aaabbbccc);
    }
}
