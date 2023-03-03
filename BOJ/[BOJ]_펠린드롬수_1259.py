while True:
    target = input()

    if target == "0":
        break

    if len(target) == 1:
        print("yes")
        continue

    half = len(target) // 2
    for i in range(half):
        if target[i] == target[-i-1]:
            if i == half-1:
                print("yes")
            continue
        else:
            print("no")
            break
            