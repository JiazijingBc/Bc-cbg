import java.util.*;

public class LC127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordSet = new HashSet<>(wordList);
        wordSet.remove(beginWord);
        Queue<String> queue = new LinkedList<>();
        HashMap<String, Integer> visited = new HashMap<>();
        queue.add(beginWord);
        int ans = 1;
        while (queue.size()!=0){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                char[] chars = word.toCharArray();
                for (int j = 0; j < endWord.length(); j++) {
                    char before = chars[j];
                    for (char k = 'a' ;k<='z';k++){
                        if (before == k){
                            continue;
                        }
                        chars[j] = k;
                        String s = String.valueOf(chars);
                        if(wordSet.contains(s) && !visited.containsKey(s)){
                            if (s.equals(endWord)){
                                return ans+1;
                            }
                            visited.put(s,1);
                            queue.add(s);
                            if (visited.size()==wordSet.size()){
                                return 0;
                            }
                        }
                    }
                    chars[j] = before;
                }
            }
            ans++;
        }
        return 0;
    }

    public static void main(String[] args) {
        LC127 lc127 = new LC127();
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(new String[]{"hot","dot","dog","lot","log","app"}));
        System.out.println(lc127.ladderLength("hit", "cog", strings));
    }
}
