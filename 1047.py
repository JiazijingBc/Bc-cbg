class Solution:
    def removeDuplicates(self, S: str) -> str:
        a = [0]
        for i in range(len(S)):
            if S[i] != a[-1]:
                a.append(S[i])
            else:
                a.pop()
        a.remove(0)
        return ''.join(a)