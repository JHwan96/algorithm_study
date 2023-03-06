a = int(input())
list_ = []
for i in range(a):
    age, name = input().split()
    list_.append((int(age),name))

list_.sort(key=lambda x: x[0])

for x,y in list_:
    print(x, y)
