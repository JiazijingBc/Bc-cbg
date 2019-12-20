class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        a = []
        b = []
        for i in S:
            if i == '#' and a!= []:
                a.pop()
            elif i != '#':
                a.append(i)
        for j in T:
            if j == '#' and b!= []:
                b.pop()
            elif j!= '#':
                b.append(j)
        if a == b :
            return True
        else:
            return False