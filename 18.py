class Solution:
    def fourSum(self, nums: [int], target: int) -> [[int]]:
        nums.sort()
        lens = len(nums)
        if lens < 4:
            return []
        res = []
        for i in range(lens - 3):
            if i>0 and nums[i]==nums[i-1]:
                continue
            for j in range(i+1,lens-2):
                if j-i > 1 and nums[j] == nums[j-1]:
                    continue
                left = j+1
                right = lens-1
                while (right>left):
                    tmp = nums[i] + nums[j] + nums[right] + nums[left]
                    if target == tmp:
                        res.append([nums[i],nums[j],nums[left],nums[right]])
                        while left < right and nums[left] == nums[left+1]:
                            left += 1
                        while left < right and nums[right] == nums[right-1]:
                            right -= 1
                        left += 1
                        right -= 1
                    if tmp>target:
                        right -= 1
                    if tmp<target:
                        left +=1
        return res

            
obj = Solution()
print(obj.fourSum([-1,0,-5,-2,-2,-4,0,1,-2],-9))