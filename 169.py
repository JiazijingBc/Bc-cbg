class Solution:
    def majorityElement(self, nums:[int]) -> int:
        nums.sort()
        return nums[int(len(nums)/2)]

obj=Solution()
print(obj.majorityElement([1,2,2,2,2,1,4]))