class Solution:
    def myAtoi(self, s: str) -> int:
        ans=[]
        a = ['+','-','1','2','3','4','5','6','7','8','9','0']
        s = s.lstrip()
        if s =='' or s =='+' or s == '-':
            return 0
        for i in range(len(s)):
            if i == 0 and s[i] not in a:
                return 0 
            if i >0 and s[i] not in ['1','2','3','4','5','6','7','8','9','0']:
                break
            ans.append(s[i])
        b = ''.join(ans)
        if b =='+' or b == '-':
            return 0
        if -2147483648 <= float(b) <= 2147483647:
            return int(b)
        elif float(b)>2147483647:
            return 2147483647
        elif float(b)< -2147483648  :
            return -2147483648