import java.util.*;

public class LC767 {
    public String reorganizeString(String S) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] chars = S.toCharArray();
        StringBuilder res = new StringBuilder();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                Integer a = map.get(aChar);
                a++;
                map.replace(aChar, a);
            } else map.put(aChar, 1);
        }


        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                        return o2.getValue()-o1.getValue();
                    }
                }
        );
        for (Map.Entry<Character, Integer> characterIntegerEntry : list) {
            if (characterIntegerEntry.getValue()>(S.length()+1)/2){
                return "";
            }
            if (characterIntegerEntry.getValue()>0){
                pq.offer(characterIntegerEntry);
            }
        }
        while (!pq.isEmpty()){
            Map.Entry<Character, Integer> peek = pq.peek();
            pq.poll();
            Map.Entry<Character, Integer> peek1 = pq.peek();
            pq.poll();
            res.append(peek.getKey());
            Integer value = peek.getValue();
            if (value>1){
                peek.setValue(value-1);
                pq.offer(peek);
            }
            if (peek1 != null){
                res.append(peek1.getKey());
                Integer value1 = peek1.getValue();
                if (value1>1){
                    peek1.setValue(value1-1);
                    pq.offer(peek1);
                }
            }
        }

        return res.toString();
    }
}
