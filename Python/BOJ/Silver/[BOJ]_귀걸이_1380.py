count = 1
while True:
    n = int(input())
    if n == 0:
        break
    list_name = []
    list_check = [0]*n
    for i in range(n):
        name = input()
        list_name.append(name)
    

    for i in range(2*n-1):
        a,b = map(str, input().split())
        list_check[int(a)-1] += 1
    
    for idx, i in enumerate(list_check):
        if i == 1:
            print(count, list_name[idx])
            count+=1