class Solution:
    def singleNumber(self, nums: [int]) -> int:
        if len(nums) <=2:
            return 0
        for i in range(len(nums)):
            a = nums.pop(i)
            if a not in nums:
                return a 
            nums.insert(i,a)

jzj=Solution()
print(jzj.singleNumber([3,1,2,1,2]))

#方式二
new = []
nums =[3,1,2,1,2]
for i in nums :
    if i not in new:
        new.append(i)
    else :
        new.remove(i)
print (new.pop())

#方式三 异或
class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        a = 0
        for num in nums:
            a = a ^ num
        return a