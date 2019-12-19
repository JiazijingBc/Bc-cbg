class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        stack = []
        ans = 0
        a = 0
        for i in range(len(s)):     
            if s[i] in stack:
                b = stack.index(s[i])
                del stack[:b+1]
            stack.append(s[i])        
            a = len(stack)
            ans = max(ans,a)  
        return ans