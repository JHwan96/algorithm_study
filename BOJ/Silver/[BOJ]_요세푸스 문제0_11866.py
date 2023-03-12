from collections import deque

a,b = map(int, input().split())
list_ = deque()
result = deque()

for i in range(1,a+1):
    list_.append(i)

while list_:
    for i in range(b-1):
        list_.append(list_.popleft())
    result.append(list_.popleft())

print("<",end="")
for i in range(len(result)):
    if i == len(result)-1:
        print(result[i],end=">")
        break
    print(result[i], end=", ")
    
