a, b = map(int, input().split())
list_ = list(map(int, input().split()))
result = 0

for i in range(a):
    for j in range(i+1,a):
        for z in range(j+1, a):
            temp = list_[i]+list_[j]+list_[z]
            if temp > b:
                continue
            elif temp == b:
                result = temp
                break

            if b - result > b - temp:
                result = temp

        if result == b:
            break
    if result == b:
        break
print(result)