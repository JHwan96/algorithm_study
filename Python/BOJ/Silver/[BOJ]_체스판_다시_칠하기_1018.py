n,m = map(int, input().split())
list_ = []
for i in range(n):
    list_.append(input())

result = 64;
for i in range(n-7):
    for j in range(m-7):
        count1 = 0
        count2 = 0

        for a in range(i, i+8):
            for b in range(j, j+8):
                if (a+b) % 2 == 0:
                    if list_[a][b] != 'B':
                        count1+=1
                else:
                    if list_[a][b] != 'W':
                        count1+=1
                
                if (a+b) % 2 == 0:
                    if list_[a][b] != 'W':
                        count2+=1
                else:
                    if list_[a][b] != 'B':
                        count2+=1
        temp = min(count1, count2)
        result = min(result, temp)

print(result)