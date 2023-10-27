# import sys
# input = sys.stdin.readline

# N, M = map(int, input().split())

# no_see = []
# result = []
# count = 0

# for _ in range(N):
#     no_see.append(input().rstrip())

# for _ in range(M):
#     x = input().rstrip()
#     if x in no_see:
#         result.append(x)
#         count+=1

# print(count)
# result.sort()
# for i in result:
#     print(i)

import sys
input = sys.stdin.readline

N, M = map(int, input().split())

no_see = dict()
result = []
count = 0

for _ in range(N):
    see = input().rstrip()
    no_see[see] = 1

for _ in range(M):
    x = input().rstrip()
    if no_see.get(x):
        result.append(x)
        count+=1

print(count)
result.sort()
for i in result:
    print(i)