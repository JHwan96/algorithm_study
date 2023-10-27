a = int(input())
list_ = list(map(int, input().split()))

count = 0
for i in list_:
    if i == 1:
        continue
    elif i == 2:
        count+=1
        continue
    else:
        for j in range(2, (i+1)):
            if j == i:
                count+=1
            if i % j == 0:
                break
print(count)