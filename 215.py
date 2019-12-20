class Solution:
    def findKthLargest(self, nums:[int], k: int) -> int:
        nums.sort()
        lens = len(nums)
        a = lens - k 
        return nums[a]

obj = Solution()
print(obj.findKthLargest([3,2,1,5,6,4],4))