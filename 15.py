#方式一 暴力循环(时间过长)
class Solution:
    def threeSum(self, nums: [int]) :        
        lens = len(nums)
        ans = []  
        for i in range(lens):
            for b in range(i+1,lens):
                if 0-nums[i]-nums[b] in nums[b+1:]:
                    a = []
                    a.append(nums[i])
                    a.append(nums[b])
                    a.append(0-nums[i]-nums[b])
                    a.sort()
                    if a in ans:
                        continue
                    ans.append(a)
        return ans
obj = Solution()
print(obj.threeSum([-1, 0, 1, 2, -1, -4]))

#自编双指针（依旧过长操）
class Solution:
    def threeSum(self, nums: [int]) :
        lens = len(nums)
        if lens <3:
            return []
        l = 0
        r = lens - 1
        ans = []
        while True:
            if 0-nums[l]-nums[r] in nums[l+1:r]:
                a = []
                a.append(nums[l])
                a.append(0-nums[l]-nums[r])
                a.append(nums[r])
                a.sort()
                if a in ans:
                    ans.remove(a)
                ans.append(a)
            r-=1
            if r<= l+1:
                r = lens-1
                l +=1
            if l==lens - 1:
                break
        return ans