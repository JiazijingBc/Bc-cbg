# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        p = listNode(-1)
        p.next = head
        c = p
        while c.next and c.next.next:
            a,b = c.next,c.next.next
            c.next = b
            a.next = b.next
            b.next = a
            c = c.next.next
        return p.next
