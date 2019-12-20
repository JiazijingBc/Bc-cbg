class Solution:
    def reverseWords(self, s: str) -> str:
        b = s.split()
        lens = len(b)
        for i in range(lens):
            b[i] = b[i][::-1]
            
        return ' '.join(b)

obj=Solution()
print(obj.reverseWords("let's go to hahah"))