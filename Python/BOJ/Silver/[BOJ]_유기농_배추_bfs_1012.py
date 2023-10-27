from collections import deque

T = int(input())

def bfs(x,y):
    dx = [0, 0, -1, 1]
    dy = [1, -1, 0, 0]    

    queue = deque()
    queue.append((x,y))
    field[y][x] = 0

    while queue:
        x,y = queue.popleft()
    
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if (0 <= nx) and (nx < M) and (0 <= ny) and (ny < N):
                if field[ny][nx] == 1:
                    queue.append((nx,ny))
                    field[ny][nx] = 0


for _ in range(T):
    M, N, K = map(int, input().split())
    field = [[0]*M for i in range(N)]
    
    for i in range(K):
        X, Y = map(int, input().split())
        field[Y][X] = 1

    result = 0
    for x in range(M):
        for y in range(N):
            if field[y][x] == 1:
                bfs(x,y)
                result += 1
    
    print(result)