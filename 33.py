class Solution:
    def search(self, nums: [int], target: int) -> int:
        lens = len(nums)
        left = 0
        right = lens - 1
        while left<right:
            mid = int((left + right + 1) / 2)
            if nums[mid] < nums[right]:
                if nums[mid] <= target <= nums[right]:
                    left = mid
                else:
                    right = mid - 1
            else:
                if nums[left] <= target <= nums[mid - 1]:
                    right = mid - 1
                else:
                    left = mid
        return left if nums[left] == target else -1


            
obj = Solution()
print(obj.search([4,5,6,7,8,9,0,1,2],6))