# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def minDepth(self, root: TreeNode) -> int:
        if not root:
            return 0
        def helper(root):
            if not root:
                return 0
            if root.left:
                left = helper(root.left) + 1
            if root.right:
                right = helper(root.right) + 1
            if root.right and root.left:
                return min(left,right)
            if root.right and not root.left: 
                return right
            if not root.right and root.left:
                return left
            return 0
        return helper(root)