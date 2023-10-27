a = int(input())
result = []

for i in range(a):
    x = input()
    result.append(x)

result = sorted(list(set(result)))
result = sorted(result, key=len)

for i in result:
    print(i)