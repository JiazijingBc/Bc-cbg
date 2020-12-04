import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC17 {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> phoneMap = new HashMap<>();

        List<String> ans = new ArrayList<>();
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");
        int length = digits.length();
        for(int i =0;i<length;i++){
            List<String> res = new ArrayList<>();
            if(i == 0){
                String s = phoneMap.get(digits.charAt(i));
                for(int j = 0;j<s.length();j++){
                    res.add("" + s.charAt(j));
                }
            }
            else {
                String s = phoneMap.get(digits.charAt(i));
                for (String an : ans) {
                    for(int j = 0;j<s.length();j++){
                        res.add(an + s.charAt(j));
                    }
                }
            }
            for (String re : res) {
                System.out.println(re);
            }
            ans = res;
            System.out.println("============");
            for (String an : ans) {
                System.out.println(an);
            }
            System.out.println("============");
        }


        return ans;
    }

    public static void main(String[] args) {
        LC17 lc17 = new LC17();
        List<String> strings = lc17.letterCombinations("234");
        System.out.println("--------");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(strings.size());
    }
}
