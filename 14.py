class Solution:
    def one(self,strs:[str]) -> str:
        if strs ==[]:
            return ''
        mini = min(len(s) for s in strs)
        common = 0
        for i in range(mini):
            a = strs[0][i]
            for b in strs[1:]:
                if b[i] != a:
                    return strs[0][0:common]
            common +=1
        return strs[0][:common] 
jzj=Solution()
print(jzj.one(["flower","flow","flight"]))

            
