class Solution:
    def mergeKLists(self, lists:[ListNode]) -> ListNode:
        stack = []
        head = point = ListNode(0)
        for l in lists:
            while l:
                stack.append(l.val)
                l = l.next
        stack.sort()
        for i in stack:
            point.next = ListNode(i)
            point = point.next
        return head.next