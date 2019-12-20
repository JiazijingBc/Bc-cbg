##子集
class Solution:
    def subsets(self, nums:[int]):
        res = []
        n = len(nums)
        
        def backtrack(i, tmp):
            res.append(tmp)
            for j in range(i, n):
                backtrack(j + 1,tmp + [nums[j]] )
        backtrack(0, [])
        return res  




obj = Solution()
print(obj.subsets([1,2,3]))
