class Solution:
    def removeOuterParentheses(self, S: str) -> str:
        lens = len(S)
        ans =[]
        stack = []
        for i in range(lens)[::-1]:
            if S[i] == ')':
                stack.append(S[i])
            else:
                stack.pop()
                if stack ==[]:
                    ans.append(S[i+1:-1])
                    S = S[0:i]
        ans.reverse()
        return ''.join(ans)

obj = Solution()
print(obj.removeOuterParentheses('(()())(())'))