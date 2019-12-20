class Solution:
    def countBits(self, num: int) -> List[int]:
        target = []
        for i in range(num+1):
            count = bin(i).count('1')
            target.append(count)
            
        return target
