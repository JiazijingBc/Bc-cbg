class MyQueue:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.stack = []
    def push(self, x: int) -> None:
        """
        Push element x to the back of queue.
        """
        self.stack.append(x)

    def pop(self) -> int:
        """
        Removes the element from in front of queue and returns that element.
        """
        a = self.stack[0]
        self.stack = self.stack[1:]
        return a

    def peek(self) -> int:
        """
        Get the front element.
        """
        return self.stack[0]

    def empty(self) -> bool:
        """
        Returns whether the queue is empty.
        """
        if self.stack == []:
            return True
        return False


# Your MyQueue object will be instantiated and called as such:
obj = MyQueue()
obj.push(1)

print(obj.peek())
print(obj.pop())
print(obj.empty())
# param_3 = obj.peek()
# param_4 = obj.empty()