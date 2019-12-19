#1 暴力循环
class Solution:
    def maxArea(self, height:[int]) -> int:
        lens = len(height)
        Max = 0
        for i in range(lens):
            for b in range(i,lens):
                s = (b-i) * min(height[i],height[b])
                if s>=Max:
                    Max = s
        return Max
obj = Solution()
print(obj.maxArea([1,8,6,2,5,4,8,3,7]))


#2 双指针

class Solution:
    def maxArea(self, height:[int]) -> int:
        Max = 0
        l = 0 
        r = len(height) - 1
        while l < r :
            s = (r-l)*min(height[l],height[r])
            if Max <= s:
                Max = s
            if height[r] >= height[l]:
                l += 1
            else:
                r -= 1
        return Max
obj = Solution()
print(obj.maxArea([1,8,6,2,5,4,8,3,7]))