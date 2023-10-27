from collections import deque

def solution(n, computers):
    answer = 0
    a = deque()
    visit = [False]*n

    for idx, i in enumerate(computers):
        if visit[idx] == True:
            continue
        a.append(idx)
        visit[idx]=True
        answer+=1 
        print(idx)
        
        while True:
            for idx2, j in enumerate(computers[a.popleft()]):
                if visit[idx2] == True:
                    continue
                if j == 1:
                    visit[idx2] = True
                    a.append(idx2)
            if len(a) == 0:
                break
    return answer