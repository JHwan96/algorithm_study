from collections import deque

t = int(input())
for i in range(t):
    stack = deque()
    list_ = input()
    for i in list_:
        if len(stack) == 0:
            stack.append(i)
            continue
        tmp = stack.pop()
        if tmp == '(' and i == ')':
            continue
        else:
            stack.append(tmp)
            stack.append(i)
    if len(stack) == 0:
        print("YES")
    else:
        print("NO")