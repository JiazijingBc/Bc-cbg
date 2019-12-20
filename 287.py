###方式1

class Solution:
    def findDuplicate(self, nums: [int]) -> int:
        a = []
        for i in nums:
            if i in a:
                return i
            a.append(i)

###方式2
class Solution:
    def findDuplicate(self, nums: [int]) -> int:
        nums.sort()
        for i in range(len(nums)):
            if nums[i] == nums[i-1]:
                return nums[i]


obj = Solution()
print(obj.findDuplicate([3,1,3,4,2]))