n, k = map(int, input().split())
bin_n = bin(n)[2:]
bin_ex = bin(n)[:2]
len_bin_n = len(bin_n)
flag = 0
count = 0
list_a = []

if bin_n.count('1') <= k:
    print(0)
elif k == 0:
    print(-1)
else:
    for idx, i in enumerate(bin_n):
        if count == k:
            break
        if i == '1':
            count += 1
            list_a.append(len_bin_n - idx - 1)

    result = n
    for idx, i in enumerate(range(len(list_a))):
        if idx == len(list_a)-1:
            break
        else:
            result -= (1<<list_a[i])
            
    bitmask = 0
    while True:
        if result < (1 << bitmask):
            break
        else:
            bitmask+=1
    res = (1<<bitmask)-result
    print(res)
