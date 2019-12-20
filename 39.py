###组合总和
#1 加法
class Solution:
    def combinationSum(self, candidates: [int], target: int) :
        res = []
        lens = len(candidates)
        def backtrack(i,add,tmp):
            if add > target or i == lens:
                return
            if add == target:
                res.append(tmp)
                return
            backtrack(i,add + candidates[i],tmp + [candidates[i]])
            backtrack(i+1,add,tmp)
        backtrack(0,0,[])
        return res
#2 减法 （模仿）
class Solution:
    def combinationSum(self, candidates: [int], target: int) :
        res = []
        lens = len(candidates)
        
        def backtrack(i,target,tmp):
            
            if target < 0 or i == lens:
                return
            if target == 0:
                res.append(tmp)
                return
            backtrack(i,target - candidates[i],tmp + [candidates[i]] )
            backtrack(i+1,target,tmp)
        backtrack(0,target,[])
        return res





obj = Solution()
print(obj.combinationSum([2,3,6,7],7))