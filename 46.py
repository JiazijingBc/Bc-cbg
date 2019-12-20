##全排列
class Solution:
    def permute(self, nums:[int]):
        res = []
        def backtrack (nums,tmp):
            if not nums:
                res.append(tmp)
                return
            for i in range(len(nums)):
                backtrack(nums[:i] + nums[i+1:],tmp + [nums[i]])
        backtrack(nums,[])
        return res
    
obj = Solution()
print(obj.permute([1,2,3]))
