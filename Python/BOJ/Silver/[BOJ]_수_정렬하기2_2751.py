a = int(input())
list_ = []
for i in range(a):
    temp = int(input())
    list_.append(temp)
list_temp = sorted(list_)

for i in range(len(list_temp)):
    print(list_temp[i])