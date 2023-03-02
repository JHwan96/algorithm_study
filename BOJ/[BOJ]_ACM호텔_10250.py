a = int(input())

for i in range(a):
    H,W,N = map(int, input().split())

    floor = N % H
    num = N // H 
    num +=1

    if floor == 0:
        num -= 1
        floor = H

    if num < 10:
        print(f"{floor}0{num}")
    else:
        print(f"{floor}{num}")