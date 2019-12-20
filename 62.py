class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        if m == 1 :
            return 1
        elif n == 1:
            return 1
        else :
            return self.uniquePaths(m-1,n) + self.uniquePaths(m,n-1)

jzj = Solution()
print(jzj.uniquePaths(7,3))