from itertools import combinations
import sys
from collections import deque
import copy

N, M = map(int, input().split())

dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]
mat = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

answer = 0
virus = []
empty = []
wall = []
safe = 0

for n in range(N):
    for m in range(M):
        if mat[n][m] == 2:
            virus.append((n,m))
        elif mat[n][m] == 0:
            empty.append((n,m))

for wall in combinations(empty, 3):
    temp_mat = copy.deepcopy(mat)
    safe = len(empty)    
    for x,y in wall:
        temp_mat[x][y] = 1
        safe -= 1

    vir = deque()
    for point in virus:
        vir.append(point)

    while vir:
        for _ in range(len(vir)):
            point = vir.popleft()
            x, y = point

            for i in range(4):
                new_x = x+dx[i]
                new_y = y+dy[i]
                if 0 <= new_x < N and 0 <= new_y < M and temp_mat[new_x][new_y]==0:
                    temp_mat[new_x][new_y] = 2
                    vir.append((new_x,new_y))
                    safe -= 1 
    answer = max(safe, answer)
print(answer)