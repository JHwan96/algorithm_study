from collections import deque
import sys

input = sys.stdin.readline

N, K = map(int, input().split())
visited = [0 for i in range(100001)]

queue = deque()
queue.append(N)

while (queue):
    x = queue.popleft()
    if x == K:
        print(visited[x])
        break
    for i in (x-1, x+1, 2*x):
        if 0 <= i <= 100000 and not visited[i]:
            visited[i] = visited[x]+1
            queue.append(i)
        
        

