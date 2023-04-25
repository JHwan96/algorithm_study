import sys
input = sys.stdin.readline

N = int(input())
meeting = []
result = 0
end = -1

for _ in range(N):
    a,b = map(int, input().split())
    meeting.append([a,b])

meeting = sorted(meeting, key=lambda x : x[0])
meeting = sorted(meeting, key=lambda x : x[1])
for i in range(N):
    x,y = meeting[i]
    if end <= x:
        result+=1
        end = y
    else:
        continue

print(result)