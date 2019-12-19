### 最接近的三数之和
#方式一（暴力法）
class Solution:
    def threeSumClosest(self, nums:[int], target: int):
        nums.sort()
        lens = len(nums)
        a = {}
        
        if lens < 3:
            return 0
        for i in range(lens):
            for j in range(i+1,lens):
                for k in range(j+1,lens):
                    add = nums[i] + nums[j] + nums[k]
                    a[add] = abs(add-target)
        return min(a,key=lambda x:a[x])

obj = Solution()
print(obj.threeSumClosest([0,0,0],1))
#方式二 （双指针）
class Solution:
    def threeSumClosest(self, nums:[int], target: int):
        nums.sort()
        res = nums[0] + nums[1] + nums[2]
        lens = len(nums)
        for i in range(lens):
            if i>0 and nums[i] == nums[i-1]:
                continue
            left = i+1
            right = lens-1
            while left < right:
                cur = nums[i] + nums[left] + nums[right]
                if cur == target:
                    return cur
                if abs(res-target) > abs(cur-target):
                    res = cur
                if cur > target:
                    right -= 1
                elif cur < target:
                    left += 1
        return res
