while True:
    list_= list(map(int, input().split()))
    
    if list_[0] == 0 and list_[1] == 0 and list_[2] == 0:
        break
    
    list_ = sorted(list_)
    large = pow(list_[-1], 2) 
    a = pow(list_[1], 2)
    b = pow(list_[0], 2)

    if large == (a+b):
        print("right")
    else:
        print("wrong")