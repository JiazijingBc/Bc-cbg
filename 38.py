class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        if n == 1:
            return '1'
        
        s = self.countAndSay(n-1)
        count = 0
        ans = ''
        for i in range(len(s)):
            count += 1
            try :
                if s[i] != s[i+1]:
                    ans += str(count) + s[i]
                    count = 0
            except:
                ans += str(count) + s[i] 
        return ans
jzj = Solution()
print(jzj.countAndSay(4))
        

