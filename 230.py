# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def __init__(self):
        self.iter_num = 0
        self.res = None
        
    def kthSmallest(self, root, k):
        if not root:
            return
        self.kthSmallest(root.left, k)
        self.iter_num = self.iter_num + 1
        if self.iter_num == k:
            self.res = root.val
        else:
            self.kthSmallest(root.right, k)
        return self.res