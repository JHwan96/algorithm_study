import math

def length(x1,y1,x2,y2):
    result = math.sqrt(math.pow(abs(x1-x2), 2) + math.pow(abs(y1-y2), 2))
    return result

def gradient(x1, y1, x2, y2):
    if x1-x2 == 0:
        return 1
    else:
        return abs(y1-y2)/abs(x1-x2)

line_list = []
x1,y1,x2,y2,x3,y3 = map(int, input().split())

if x1==x2 and x2 == x3 and x1==x3:
    print(-1.)
elif y1 == y2 and y2==y3 and y1==y3:
    print(-1.)
elif gradient(x1,y1,x2,y2) == gradient(x2,y2,x3,y3) and gradient(x2,y2,x3,y3) == gradient(x1,y1,x3,y3):
    print(-1.)
else:
    line_list.append(length(x1,y1,x2,y2))
    line_list.append(length(x1,y1,x3,y3))
    line_list.append(length(x2,y2,x3,y3))

    line_list.sort()
    min_line = 2*sum(line_list[:2])
    max_line = 2*sum(line_list[-2:])
    print(max_line - min_line)
