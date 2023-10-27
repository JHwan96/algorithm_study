from heapq import heappop, heappush
import sys
input = sys.stdin.readline

N = int(input())
heap = []


for i in range(N):
    x = int(input())
    if x == 0 and not heap:
        print(0)
    elif x == 0:
        print(heappop(heap))
    else:
        heappush(heap, x)
     
    
