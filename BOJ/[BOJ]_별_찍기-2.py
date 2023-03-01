a = int(input())
str = '*'
empty = ' '
for i in range(a):
    print((empty*(a-i-1))+(str*(i+1)))
