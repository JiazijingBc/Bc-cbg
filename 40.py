###数组组合Ⅱ（未完成）
class Solution:
    def combinationSum2(self, candidates: [int], target: int):
        res = []
        n = len(candidates)
        candidates.sort()
        def backtrack(i,add,tmp):
            if add > target or i == n:
                return
            if add == target:
                res.append(tmp)
                return
            for j in range(i,n):
                
            backtrack(i+1,add+candidates[i],tmp+[candidates[i]])
        backtrack(0,0,[])  
        return res
obj = Solution()
print(obj.combinationSum2([10,1,2,7,6,1,5],8))  