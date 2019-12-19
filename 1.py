##两数之和
nums = [2,7,11,15]
target = 18
lens = len(nums)
c=[]
for i in range(lens-1):
    bz = target - nums[i]
    if bz in nums[i+1:]:
        p=nums.index(bz)
        c.append(i)
        c.append(p)
print(c)
