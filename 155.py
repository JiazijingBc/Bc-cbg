class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.minstack = []
        self.stack = []
    def push(self, x: int) -> None:
        self.stack.append(x)
        '''
        self.minstack.append(x)
        if x<= self.stack[-1]:
            self.minstack.append(x)
'''    
    def pop(self) -> None:
        self.stack.pop()

    def top(self) -> int:
        return self.stack[-1]
 
    def getMin(self) -> int:
        self.minstack = self.stack[:]
        self.minstack.sort()
        return self.minstack[0]

obj =MinStack()
obj.push(-2)
obj.push(0)
obj.push(-3)
print(obj.getMin())
obj.pop()
print(obj.top())
print(obj.getMin())


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()