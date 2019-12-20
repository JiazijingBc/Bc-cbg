class Solution:
    def calPoints(self, ops:[str]) -> int:
        ans = []
        for i in  ops:
            if i == 'C':
                ans.pop()
                        
            elif i == 'D':
                a = int(ans[-1]) *2
                ans.append(a)
            elif i == '+':
                a = int(ans[-1]) + int(ans[-2])
                ans.append(a) 
            else:
                ans.append(int(i))
        return sum(ans)