class Solution:
    def flatten(self, root: TreeNode) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        if not root:return root
        d = []
        def helper(root):
            if not root:
                return 
            d.append(root.val)
            helper(root.left)
            helper(root.right)
        helper(root)
        i = 1 
        root.left = None
        p = root
        while i < len(d):
            p.right = TreeNode(d[i])
            p = p.right
            i += 1

###    方法二 递归原地转换  （想不出来）、
def flatten(self, root: TreeNode, pre = None) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        # 类似后序遍历
        def helper(root, pre):
            if not root: return pre
            # 记录遍历时候,该节点的前一个节点
            pre = helper(root.right, pre)
            pre = helper(root.left, pre)
            # 拼接
            root.right = pre
            root.left = None
            return pre
        helper(root, None)

作者：powcai
链接：https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/solution/di-gui-he-die-dai-by-powcai-3/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。