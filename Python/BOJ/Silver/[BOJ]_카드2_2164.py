from collections import deque

n = int(input())
list_ = deque(range(1,n+1))

while True:
    if len(list_) == 1:
        print(list_.pop())
        break
    list_.popleft()
    list_.append(list_.popleft())
    