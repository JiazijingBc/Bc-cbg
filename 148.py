# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def sortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        q = []
        p = head
        while p:
            q.append(p.val)
            p = p.next
        q.sort()
        p = head
        for i in q:
            p.val = i
            p = p.next
        return head
