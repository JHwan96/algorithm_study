N, r, c = map(int, input().split())
result = 0

while N > 0 :
    half = (2**N)//2

    if r < half and c < half:    # 2사분면
        result += half*half*0
    elif r < half and c >= half: # 1사분면
        result += half*half*1
        c -= half
    elif r >= half and c < half: # 3사분면
        result += half*half*2
        r -= half    
    elif r >= half and c >= half: # 4사분면
        result += half*half*3
        r -= half
        c -= half
    
    N -= 1

print(result)
