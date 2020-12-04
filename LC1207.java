import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i : arr) {
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        Set<Object> ans = new HashSet<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : hashMap.entrySet()) {
            ans.add(integerIntegerEntry.getValue());
        }
        return ans.size()==hashMap.size();
    }
}
