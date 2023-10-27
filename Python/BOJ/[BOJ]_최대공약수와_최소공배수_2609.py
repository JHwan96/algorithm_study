a,b = map(int, input().split())
min_ = min(a, b)
max_ = max(a, b)

min_result = 1
max_result = 0
for i in range(min_+1, 1, -1):
    if (max_ % i == 0) and (min_ % i == 0):
        min_result = i
        break

x = 1
while True:
    target = max_ * x
    if target % min_ == 0:
        max_result = target
        break
    else:
        x+=1

print(min_result)
print(max_result)