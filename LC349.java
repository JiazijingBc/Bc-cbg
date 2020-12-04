import java.lang.reflect.Array;
import java.util.*;

public class LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (Integer integer : set2) {
            if (set1.contains(integer)){
                ans.add(integer);
            }
        }
        int[] ints = new int[ans.size()];
        int i =0;
        for (Integer an : ans) {
            ints[i++] = an;
        }
        return ints;
    }
    public int[] intersection1(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i<nums1.length && j < nums2.length){
            if (nums1[i] == nums1[i+1]){
                i++;
            }
            if (nums2[j] == nums2[j+1]){
                j++;
            }
            if (nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else {
                res.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ints = new int[res.size()];
        int k= 0;
        for (Integer re : res) {
            ints[k++] = re;
        }
        return ints;
    }
}
