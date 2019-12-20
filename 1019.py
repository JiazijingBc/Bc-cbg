# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def nextLargerNodes(self, head: ListNode) -> List[int]:
        if not head:
            return None
        res = []
        ans = []
        while head:
            res.append(head.val)
            head = head.next
        for i in range(len(res)):
            flag = 0
            for j in range(i+1,len(res)):
                
                if res[j] > res[i]:
                    ans.append(res[j])
                    flag = 1
                    break
            if not flag:
                ans.append(0)
        
        return ans

####      单调栈
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def nextLargerNodes(self, head):
        """
        :type head: ListNode
        :rtype: List[int]
        """
        #### 先将Node类型转换为int链表方便处理 ####
        length, p = 0, head
        while p != None:
            length += 1
            p = p.next
        ori = [0 for i in range(length)]
        p = head
        for i in range(length):
            ori[i] = p.val
            p = p.next
        #### end ####
        ##### 运用栈，栈内存数组下标，这样可以根据下标直接找到相应位置直接进行替换 #####
        stack = [0]
        ans = [0 for i in range(length)]
        for i in range(1, length):
            while stack and ori[i] > ori[stack[-1]]:
                ans[stack[-1]] = ori[i]
                stack.pop()
            stack.append(i)
        ##### end #####
        return ans
