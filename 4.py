class Solution:
    def findMedianSortedArrays(self, nums1: [int], nums2: [int]) -> float:
        nums = nums1 + nums2
        nums.sort()
        lens = len(nums)
        if lens %2 == 1:
            return nums[int((lens-1)/2)]
        else:
            add = nums[int(lens/2)] +nums[int(lens/2)-1]
            ans = add/2
            return ans
jzj = Solution()
print(jzj.findMedianSortedArrays([1,3],[2]))