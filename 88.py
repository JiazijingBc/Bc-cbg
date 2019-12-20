class Solution:
    def merge(self, nums1: [int], m: int, nums2: [int], n: int) -> None:
        nums1[m:] = nums2
        nums1.sort()
        