### 方式一（指针）
class Solution:
    def dailyTemperatures(self, T: [int]) -> [int]:
        lens = len(T)
        left = 0
        right = left + 1
        ans = []
        while True:
            if T[left] >= T[right]:
                right += 1
                if right == lens:
                    ans.append(0)
                    left += 1
                    right = left + 1
            else:
                ans.append(right - left)
                left += 1
                right = left + 1
            if left == lens - 1:
                ans.append(0)
                break
        return ans 
### 方式二 （栈）
class Solution:
    def dailyTemperatures(self, T: [int]) -> [int]:
        
        ans = []
        lens = len(T)
        for i in range(lens):
            stack = []
            stack.append(T[i])
            for j in range(i+1,lens):
                stack.append(T[j])
                if T[j] > T[i]:
                    x = stack.index(T[j]) - stack.index(T[i]) 
                    ans.append(x)
                    break
                else:
                    if stack[-1] == T[-1]:
                        ans.append(0)
            if len(stack) == 1:
                ans.append(0)
        return ans


### 方式三（）
class Solution(object):
    def dailyTemperatures(self, T):
        stack, r = [], [0] * len(T)
        for i, t in enumerate(T):
            while stack and T[stack[-1]] < t: r[stack.pop()] = i - stack[-1]
            stack.append(i)
        return r
