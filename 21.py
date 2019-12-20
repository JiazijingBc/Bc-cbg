### 自己做的未通过
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        head = ListNode(0)
        res = head
        while l1 and l2:
            if l1.val <= l2.val:
                res.next = l1
                l1 = l1.next
            else:
                res.next  = l2
                l2 = l2.next
            res = res.next
        return head.next 
a = Solution()
print(a.mergeTwoLists([1,2,3],[1,3,4]))
###通过
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
class Solution:
    def mergeTwoLists(self, l1, l2):
        # maintain an unchanging reference to node ahead of the return node.
        prehead = ListNode(-1)

        prev = prehead
        while l1 and l2:
            if l1.val <= l2.val:
                prev.next = l1
                l1 = l1.next
            else:
                prev.next = l2
                l2 = l2.next            
            prev = prev.next

        # exactly one of l1 and l2 can be non-null at this point, so connect
        # the non-null list to the end of the merged list.
        prev.next = l1 if l1 is not None else l2

        return prehead.next

            
                