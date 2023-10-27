n = int(input())
list_ = list(map(int, input().split()))

dict_ = dict()
for i in list_:
    if i in dict_:
        dict_[i] += 1
    else:
        dict_[i] = 1

list_1 = sorted(list(dict_.keys()))

m = int(input())
list_2 = list(map(int, input().split()))

def func(target):
    left = 0
    right = len(list_1) - 1 

    while left <= right:
        mid = (left + right) // 2
        if target > list_1[mid]:
            left = mid + 1
        elif target == list_1[mid]:
            return True
        else:
            right = mid - 1
    

for i in range(len(list_2)):
    if func(list_2[i]):
        print(dict_[list_2[i]], end=' ')
    else:
        print(0, end=' ')