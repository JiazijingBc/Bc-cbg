class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        n1 = len(num1)
        n2 = len(num2)
        res_1 = 0
        res_2 = 0
        for i in range(n1):
            first = ord(num1[i]) - ord('0')
            res = first * (10**(n1-i-1)) 
            res_1 += res
        for i in range(n2):
            sec = ord(num2[i]) - ord('0')
            res = sec * (10**(n2-i-1))
            res_2 += res
        result = str(res_1 * res_2)
        return result