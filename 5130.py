###方式一
class Solution:
    def numEquivDominoPairs(self, dominoes) -> int:
        num = 0
        lens = len(dominoes)
        for i in range(lens):
            for j in range(i+1,lens):
                if dominoes[i] == dominoes[j] or dominoes[i][::-1] == dominoes[j]: 
                    num += 1
                
        return num
            
obj = Solution()
print(obj.numEquivDominoPairs([[1,1],[2,2],[1,1],[1,2],[1,2],[1,1]]))

###方式二
class Solution:
    def numEquivDominoPairs(self, dominoes) -> int:
        num = 0
        lens = len(dominoes)
        i = 0
        j = 1
        while True:
            
            if dominoes[i] == dominoes[j] or dominoes[i][::-1] == dominoes[j]: 
                num += 1
                j += 1
            else:
                j += 1 
            if j == lens:
                i += 1 
                j = i + 1
            if i == lens-1:
                break
        return num