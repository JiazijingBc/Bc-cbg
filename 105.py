# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> TreeNode:
        if not inorder:
            return None
        mid = inorder.index(preorder[0])
        node = TreeNode(preorder[0])
        ileft = inorder[:mid]
        iright = inorder[mid+1:]
        a = len(ileft)
        b = len(iright)
        pleft = preorder[1:1+a]
        pright = preorder[-b:]
        node.left = self.buildTree(pleft,ileft)
        node.right = self.buildTree(pright,iright)
        return node
        
        
