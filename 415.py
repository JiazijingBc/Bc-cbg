class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        ans = []
        bz = 0
        num1 = num1[::-1]
        num2 = num2[::-1]
        len1, len2 = len(num1), len(num2)
        if len1 >= len2:
            a = num1
        else:
            a = num2
        minlen = min(len1,len2)
        for i in range(minlen):
            res = int(num1[i]) + int(num2[i]) + bz
            bz = 0
            if res >= 10:
                res = res - 10 
                bz = 1
                ans.append(str(res))
            else:
                ans.append(str(res))
        for j in range(minlen,len(a)):
            res = int(a[j]) + bz
            bz = 0
            if res >= 10:
                res = res - 10 
                bz = 1
                ans.append(str(res))
            else:
                ans.append(str(res))
        if bz == 1:
            ans.append('1')
        return ''.join(ans[::-1])




obj = Solution()
print(obj.addStrings('1','9'))