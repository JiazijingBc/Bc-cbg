class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        count = 0
        for c in str(n):
            if c == "1":
                count += 1
        return count  

obj = Solution()
print(obj.hammingWeight(1010010))