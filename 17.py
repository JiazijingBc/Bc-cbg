##复习
class Solution:
    def letterCombinations(self, digits: str):
        res = [""]
        dic = {'1':'','2':'abc','3':'def','4':'ghi','5':'jkl','6':'mno','7':'pqrs','8':'tuv','9':'wxyz'}
        if digits == '':
            return []
        for d in digits:
            if d == '1':
                continue
            temp = []
            if d in dic.keys():
                for c in dic[d]:
                    for r in res:
                        temp.append(r + c)   ##血妈关键
                res = temp
        return res