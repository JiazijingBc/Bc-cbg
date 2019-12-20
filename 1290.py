# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        res = []
        while head:
            res.append(head.val)
            head = head.next
        res = res[::-1]
        count = 0
        for i in range(len(res)):
            count += res[i]*(2**i)
        return count