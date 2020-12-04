public class LC242 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int[] s_flag = new int[26];
        int[] t_flag = new int[26];
        for (int i = 0; i < s.length(); i++) {
            s_flag[s.charAt(i)-'a']+=1;
            t_flag[t.charAt(i)-'a']+=1;
        }
        for (int i = 0; i < s_flag.length; i++) {
            if (s_flag[i]!=t_flag[i]){
                return false;
            }
        }
        return true;
    }
}
