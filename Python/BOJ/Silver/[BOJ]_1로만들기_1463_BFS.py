from collections import deque

x = int(input())
queue = deque()
queue.append((x,0))

while queue:
    a, count = queue.popleft()
    print(a)
    if a == 1:
        print(count)
        break

    if a % 3 == 0:
        queue.append((a//3, count+1))
    
    if a % 2 == 0:
        queue.append((a//2, count+1))
    
    queue.append((a-1, count+1))