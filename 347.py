class Solution:
    def topKFrequent(self, nums: [int], k: int) -> [int]:
        nums.sort()
        ans = {}
        tag = []
        b = []
        for num in nums:
            if num in ans.keys():
                ans[num] += 1
            else:
                ans[num] = 1

        for i in ans.values():
            tag.append(i)
        tag.sort()
        tag = tag[::-1]
        for i in range(0,k):
            b.append(list(ans.keys())[list(ans.values()).index(tag[i])])
        return b


obj = Solution()
print(obj.topKFrequent([1,2],2))

###  有问题