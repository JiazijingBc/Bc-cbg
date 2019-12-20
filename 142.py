# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

###  方式一 投机取巧法
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        while head:
            if head.val == 'bjfuvth':
                return head
            else:
                head.val = 'bjfuvth'
            head = head.next
        return None

###方式二  快慢指针
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        fast, slow = head, head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            if fast == slow: 
                prt1 = head 
                prt2 = fast
                while True:
                    if prt1 == prt2:
                        return prt1
                    prt1 = prt1.next
                    prt2 = prt2.next
                    
        return None