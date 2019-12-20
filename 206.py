# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head):
        if not head or not head.next:
            return head
        p = None
        while head:
            q = head
            head = q.next
            q.next = p 
            p = q
        head = p
        return head