class Solution:
    def removeElement(self, nums: [int], val: int) -> int:
        lens = len(nums)
        for i in range(lens)[::-1]:
            if nums[i] == val:
                del nums[i]
        return nums

jzj = Solution()
print(jzj.removeElement([0,1,2,2,3,0,4,2],2))