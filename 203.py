# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeElements(self, head: ListNode, val: int) -> ListNode:
        p = ListNode(-1)
        p.next = head
        h = p
        while p.next:
            if p.next.val == val:
                p.next = p.next.next
                continue
            p = p.next
        return h.next