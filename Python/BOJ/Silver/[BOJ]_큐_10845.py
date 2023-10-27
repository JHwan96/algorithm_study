from collections import deque
import sys
input = sys.stdin.readline

n = int(input().strip())
list_ = deque()

for i in range(n):
    target = input().strip()
    len_ = len(target.split(' '))
    if len_ == 2:
        y = target.split(' ')[1]
        list_.append(y)
    else:
        if target == 'back':
            if len(list_) == 0:
                print(-1)
            else:
                tmp = list_.pop()
                print(tmp)
                list_.append(tmp)
        elif target == 'front':
            if len(list_) == 0:
                print(-1)
            else:
                tmp = list_.popleft()
                print(tmp)
                list_.appendleft(tmp)            
        elif target == 'size':
            print(len(list_))
        elif target == 'pop':
            if len(list_) == 0:
                print(-1)
            else:
                print(list_.popleft())
        else:
            if len(list_) == 0:
                print(1)
            else:
                print(0)

