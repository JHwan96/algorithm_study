import sys
input = sys.stdin.readline

a = int(input())
list_ = []
for i in range(a):
    set_ = tuple(map(int, input().split()))
    list_.append(set_)

list_.sort(key=lambda x: (x[0],x[1]))
for x,y in list_:
    print(x,y)