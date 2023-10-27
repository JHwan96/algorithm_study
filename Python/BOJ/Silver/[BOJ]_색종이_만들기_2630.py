import sys
input = sys.stdin.readline

N = int(input())
paper = []
b = 0
w = 0

for i in range(N):
    paper.append(list(map(int, input().split())))


def dfs(list_x):
    len_ = len(list_x)
    flag = 0
    white = 0
    blue = 0
    for list_ in list_x:
        if 1 in list_ and 0 in list_:
            print("0,1!")
            flag = 2
        elif 1 not in list_:
            if blue != 0:
                flag = 2
            print("white!")
            white += 1
        elif 0 not in list_:
            if white != 0:
                flag = 2
            print("Blue!")
            blue += 1
        if white == len_:
            print("white paper")
        elif blue == len_:
            print("blue paper")
    if flag == 1:
        blue +=1
    elif flag == 0:
        white += 1
    else:
        dfs(list_x[])

dfs(paper)