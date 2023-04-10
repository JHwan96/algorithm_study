import sys
input = sys.stdin.readline
# sys.setrecursionlimit(10000)

N = int(input())
M = int(input())
dict_ = dict()
com = [0] * (N+1)

for i in range(1,N+1):
    dict_[i] = list()

for i in range(M):
    a,b = map(int, input().split())
    if b in dict_.values():
        pass
    else:
        dict_[a].append(b)
    if b in dict_.values():
        pass
    else:
        dict_[b].append(a)

def dfs(x):
    com[x] = 1
    list_ = dict_[x]

    for i in list_:
        if com[i] == 1:
            continue
        else:
            dfs(i)

dfs(1)
print(sum(com)-1)