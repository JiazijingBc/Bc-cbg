# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
###   通过利用排序二叉树的中序遍历是递增的 来解题
class Solution:
    def isValidBST(self, root: TreeNode) -> bool:
        res = []
        def helper(root):
            if not root:
                return 
            helper(root.left)
            res.append(root.val)
            helper(root.right)
        helper(root)
        return res == sorted(res) and len(set(res)) == len(res)



# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
####  边界问题
class Solution:
    def isValidBST(self, root: TreeNode) -> bool:

        def helper(root,low = float('-inf'),up = float('inf')):
            if not root:
                return True
            num = root.val
            if num >= up or num <= low:
                return False
            if not helper(root.right,num,up):
                return False
            if not helper(root.left,low,num):
                return False
            return True
        return helper(root)