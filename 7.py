def reverse(x:int):
    if x>=0:
        a = x
        y = int(str(a)[::-1])
        if -2**31<y<2**31-1:
            print(y)
        else:
            print('溢出')
    if x<0:
        a = -x
        y = 0 - int(str(a)[::-1])
        if -2**31<y<2**31-1:
            print(y)
        else:
            print('溢出')
reverse(-120)