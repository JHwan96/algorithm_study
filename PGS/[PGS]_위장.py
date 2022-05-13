def solution(clothes):
    clothes_dict = {}
    answer = 0
    for i in range(len(clothes)):
        category = clothes[i][1]
        if category in clothes_dict.keys():
            clothes_dict[category]+=1
        else:
            clothes_dict[category]=1
    
    if len(clothes_dict) == 1:
        answer = next(iter(clothes_dict.values()))
    else:
        result = 1
        for tmp in clothes_dict.values():
            result *= (tmp+1)
        answer = result-1
    return answer