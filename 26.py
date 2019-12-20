class Solution:
    def removeDuplicates(self, nums:[int]) -> int:
        lens = len(nums)
        for i in range(lens)[:0:-1]:
            if nums[i] == nums[i-1]:
                del nums[i]
        return nums

jzj=Solution()
print(jzj.removeDuplicates([1,1,2,2,3,4,4,5,5]))    


