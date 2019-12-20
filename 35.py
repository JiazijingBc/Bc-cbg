###方式一
class Solution:
    def searchInsert(self, nums: [int], target: int) -> int:
        lens = len(nums)
        if target <= nums[0]:
            return 0
        elif target > nums[-1]:
            return lens
        else:
            for i in range(lens):
                if nums[i]<target<=nums[i+1]:
                    return i+1

jzj=Solution()
print(jzj.searchInsert([1,3,5,6],0))
    
###方式二
class Solution:
    def searchInsert(self, nums, target):
        
        if target in nums:
            return nums.index(target)
        else:
            nums.append(target)
            nums.sort()
            return nums.index(target)