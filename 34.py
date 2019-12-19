###暴力
class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        ans = []
        for i in range(len(nums)):
            if nums[i] == target:
                ans.append(i)
        if len(ans) == 0:
            return [-1,-1]
        else:   
            return [ans[0],ans[-1]]

jzj = Solution()
print(jzj.searchRange([5,7,7,8,8,10],6))



###两次二分
class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        lens = len(nums)
        left = 0
        right = lens - 1
        
        while left < right:
            mid = (left + right) // 2 
            if nums[mid] >= target:
                right = mid
            else :
                left = mid + 1
        if not nums or nums[left] != target:
            return [-1,-1]
        
        a,b = left,lens - 1
        while a<b:
            mid = (a+b+1)//2
            if nums[mid] <= target:
                a = mid
            else:
                b = mid -1
        return [1,a]
    





jzj = Solution()
print(jzj.searchRange([5,7,7,8,8,10],6))