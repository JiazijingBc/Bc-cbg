class Solution:
    def nextGreaterElement(self, nums1: [int], nums2: [int]) -> [int]:
        ans = []
        for i in nums1:
            bz = False
            a = nums2.index(i)
            for b in nums2[a+1:]:
                if b > i :
                    ans.append(b)
                    bz = True
                    break
                
            if bz == False:
                ans.append(-1)
        return ans