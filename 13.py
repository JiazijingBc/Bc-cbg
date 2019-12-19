
s = 'MCMXCIV'
d = {'I':1, 'IV':4, 'V':5, 'IX':9, 'X':10, 'XL':40, 'L':50, 'XC':90, 'C':100, 'CD':400, 'D':500, 'CM':900, 'M':1000}

c = 0
while len(s) > 0:
    ss = s[0:2]
    if ss in d:
        c += d.get(ss)
        s = s[2:]
    else:
        c += d.get(s[0:1])
        s = s[1:]
print(c)