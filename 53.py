class Solution:
    def maxSubArray(self, nums: [int]) -> int:
        ans = nums[0]
        add = 0
        for i in range(len(nums)):
            
            if add <=0:
                add = nums[i]
                
            else:
                add += nums[i]
            ans = max(ans,add)
        return ans
jzj = Solution()
print(jzj.maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))