###自己的方法（倒序）

class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        lens=len(needle)
        if needle == '':
            return 0
        if needle not in haystack:
            return -1
        while len(haystack)>0:
            lens=len(needle)
            ss = haystack[-lens:]
            if ss == needle:
                p=haystack.index(ss)
                return p
            else:
                haystack =haystack[:-1]

##内置函数
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
		return haystack.find(needle)

## 方式3
class Solution:
 	def strStr(self, haystack: 'str', needle: 'str') -> 'int':
 	    for i in range(0, len(haystack) - len(needle) + 1):
 	        if haystack[i:i+len(needle)] == needle:
 	            return i
     	return -1
