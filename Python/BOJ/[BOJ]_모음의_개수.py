
while True:
    count = 0
    a = input()
    if a == '#':
        break
    for i in a:
        if i == 'a' or i == 'A':
            count+=1
        elif i == 'e' or i == 'E':
            count+=1
        elif i == 'i' or i == 'I':
            count+=1
        elif i == 'o' or i == 'O':
            count+=1
        elif i == 'u' or i == 'U':
            count+=1
        else:
            continue
    print(count)
