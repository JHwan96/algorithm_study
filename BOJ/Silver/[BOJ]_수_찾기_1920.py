import sys
input = sys.stdin.readline

n=int(input().strip())
list_n = list(map(int, input().split()))
m=int(input())
list_m = list(map(int, input().split()))
list_n = sorted(list_n)

def fun(target):
    left = 0
    right = len(list_n) - 1
    while True:
        middle = (right+left) // 2
        if left > right:
            break

        if target > list_n[middle]:
            left = middle + 1
        elif target == list_n[middle]:
            return True
        else:
            right = middle - 1

for i in range(m):
    if fun(list_m[i]):
        print(1)
    else:
        print(0)
