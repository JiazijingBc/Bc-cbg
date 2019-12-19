# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        carry = 0
        head = ListNode(0)
        res = head
        while l1 or l2:
            num1 = l1.val if l1 else 0
            num2 = l2.val if l2 else 0
            tmp = num1 + num2 + carry
            carry = 1 if tmp >= 10 else 0
            head.next = ListNode(tmp % 10)
            head = head.next
            if l1: l1 = l1.next
            if l2: l2 = l2.next
        if carry: head.next = ListNode(1)
        return res.next

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        flag = 0
        head = ListNode(0)
        r = head
        while l1 or l2 :
            a = l1.val +l2.val + flag
            if a >9 :
                flag = 1
                p = a - 10
            else:
                flag = 0
                p = a
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            head.next = ListNode(p)
            head = head.next
            
        return r.next