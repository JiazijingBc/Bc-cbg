##递归超时

class Solution:
    def canJump(self, nums) -> bool:
        res = 0
        n = len(nums) - 1
        def helper(res):
            if (res < n and nums[res] == 0 ):
                return 
            if res == n:
                return True
            for i in range(1,nums[res] + 1):
                if (helper(res+i)):
                    return True
            return False
        return helper(res)
jzj = Solution()
print(jzj.canJump([3,2,1,0,1]))


### 大神做法
解题思路：
如果某一个作为 起跳点 的格子可以跳跃的距离是 3，那么表示后面 3 个格子都可以作为 起跳点。
可以对每一个能作为 起跳点 的格子都尝试跳一次，把 能跳到最远的距离 不断更新。
如果可以一直跳到最后，就成功了。


class Solution:
    def canJump(self, nums) -> bool:
        k = 0
        for i in range(len(nums)):
            if (i>k):
                return False
            k = max(k,i + nums[i])
        return True
jzj = Solution()
print(jzj.canJump([3,2,1,0,1]))
