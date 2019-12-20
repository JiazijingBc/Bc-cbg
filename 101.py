# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        def check(a,b):
            if not a and not b :
                return True
            elif not a or not b:
                return False
            if a.val != b.val:
                return False
            
            return check(a.left,b.right) and check(a.right,b.left)
        return check(root,root)