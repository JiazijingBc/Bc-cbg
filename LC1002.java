import java.util.ArrayList;
import java.util.List;

public class LC1002 {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        char[] ans = new char[26];
        char[] chars1 = A[0].toCharArray();
        for (char c : chars1) {
            ans[c-'a']+=1;
        }
        for(int i =1;i<A.length;i++){
            char[] res = new char[26];
            char[] chars2 = A[i].toCharArray();
            for (char c : chars2) {
                res[c - 'a'] += 1;
            }
            for(int j = 0;j<26;j++){
                if(ans[j] > res[j]){
                    ans[j] = res[j];
                }
            }
        }
        for(int i = 0;i<ans.length;i++){
            if(ans[i]>0){
                for (int j = 0; j < ans[i]; j++) {
                    list.add(((char) ('a' + i) + ""));
                }
            }
        }
        return list;
    }
}
