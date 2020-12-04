
import java.util.Arrays;

public class LC350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l1=nums1.length;
        int l2=nums2.length;
        int[] ans = new int[Math.min(l2,l1)];
        int index1=0,index2=0,index3=0;
        while (index1<l1 && index2<l2){
            if(nums1[index1]<nums2[index2]){
                index1++;
            }
            else if(nums1[index1]>nums2[index2]){
                index2++;
            }
            else {
                ans[index3]=nums1[index1];
                index1++;
                index2++;
                index3++;
            }
        }


        return Arrays.copyOfRange(ans,0,index3);
    }
}
