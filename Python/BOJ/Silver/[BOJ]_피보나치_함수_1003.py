T = int(input())
count_0 = [0] * 41
count_1 = [0] * 41
count_0[0] = 1
count_1[1] = 1
count_1[2] = 1
count_0[2] = 1

def fibonacci(N):
    if N == 1 or N == 0 or N == 2:
        return
    for i in range(2, N+1):
        count_0[i] = count_0[i-1] + count_0[i-2]
        count_1[i] = count_1[i-1] + count_1[i-2]
        
        
for i in range(T):
    N = int(input())
    fibonacci(N)
    print(count_0[N], count_1[N])
