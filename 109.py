# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


###方法一
class Solution:
    def findmiddle(self,head):
        fast = head
        slow = head
        flag = None
        while fast and fast.next:
            flag = slow
            slow = slow.next
            fast = fast.next.next
        if flag: flag.next = None
        return slow

    def sortedListToBST(self, head: ListNode) -> TreeNode:
        if not head:return None
        mid = self.findmiddle(head)
        node = TreeNode(mid.val)
        if head ==mid:
            return node
        node.left = self.sortedListToBST(head)
        node.right = self.sortedListToBST(mid.next)
        return node



###方法二
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def trans(self,head):
        nums = []
        while head:
            nums.append(head.val)
            head = head.next
        return nums

    def sortedListToBST(self, head: ListNode) -> TreeNode:
        if not head:
            return None
        nums = self.trans(head)
        def a(nums):
            if not nums:
                return None
            mid =len(nums)//2
            node = TreeNode(nums[mid])
            left = nums[:mid]
            right = nums[mid+1:]
            node.left = a(left)
            node.right = a(right)
            return node
        return a(nums)