class Solution:
    def productExceptSelf(self, nums:[int]) -> [int]:
        output = []
        lens = len(nums)
        p = 1
        for i in range(lens):
            output.append(p)
            p = p * nums[i]
        p = 1
        for i in range(lens)[::-1]:
            output[i] = output[i] * p
            p = p*nums[i]

        return output
    