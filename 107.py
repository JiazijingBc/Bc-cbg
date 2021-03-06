# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def levelOrderBottom(self, root: TreeNode) -> List[List[int]]:
        levels = []
        if not root:
            return levels
        def helper(root,level):
            if not root:return
            if len(levels) == level:
                levels.append([])
            levels[level].append(root.val)
            if root.left:
                helper(root.left, level + 1)
            if root.right:
                helper(root.right, level + 1)
        helper(root,0)
        return levels[::-1]