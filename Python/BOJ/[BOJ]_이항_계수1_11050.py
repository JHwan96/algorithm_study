a, b = map(int, input().split())

x = 1
y = 1
count = 0

for i in range(a, 1, -1):
    if count == b:
        break
    x *= i
    count+=1

for i in range(b, 1, -1):
    y *= i

print(x//y)