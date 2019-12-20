###方式一（时间过长）
class Solution:
    def containsDuplicate(self, nums: [int]) -> bool:
        if nums == []:
            return False
        a = nums[:]
        for i in a:
            nums.remove(i)
            for b in nums:
                if  i == b:
                    return  True
                
        return False
obj = Solution()
print(obj.containsDuplicate([1,2,3,4,5,5]))

#方式二 前后对比
class Solution:
    def containsDuplicate(self, nums: [int]) -> bool:
        nums.sort()
        lens = len(nums)
        if lens <= 1:
            return False
        for i in reversed((range(lens))):
            if nums[i] == nums[i-1]:
                return True
        return False
obj = Solution()
print(obj.containsDuplicate([0]))

##方式三 set()函数
class Solution:
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        set1 = set(nums)
        if len(set1) == len(nums):
            return False
        else:
            return True