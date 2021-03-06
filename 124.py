# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def maxPathSum(self, root: TreeNode) -> int:
        self.res = float("-inf")
        def helper(root):
            if not root: return 0
            # 左边最大值
            left = helper(root.left)
            # 右边最大值
            right = helper(root.right)
            # 和全局变量比较
            self.res = max(left + right + root.val, self.res)
            # >0 说明都能使路径变大
            return max(0, max(left,  right) + root.val)
        helper(root)
        return self.res 
