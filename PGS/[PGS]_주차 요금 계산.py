from math import ceil

def time_count(in_time : str, out_time : str):
   # minute : 총 분 수
    in_token = in_time.split(":")
    out_token = out_time.split(":")
    time = int(out_token[0]) - int(in_token[0])
    minute = (time*60 + int(out_token[1])) - int(in_token[1])
    return minute

def cost_counting(fees, time):
    result = 0
    if time < fees[0]:
        result = fees[1]
    else:
        exceed_time = time-fees[0]
        pay_time = ceil(exceed_time/fees[2])
        result = fees[1]+(pay_time * fees[3])
    return result
    

def solution(fees, records):
    car_dict = {}
    num_time = {}
    for records in records:
        time, number, inout = records.split(' ')
        if number in car_dict.keys():
            in_time=car_dict[number]
            time = time_count(in_time, time)
            
            if number in num_time.keys():    
                num_time[number] += time
            else:
                num_time[number] = time
            
            del car_dict[number]
        else:
            car_dict[number]=time
            
    if len(car_dict) != 0:
        for num, In in car_dict.items():
            time = time_count(In, '23:59')
            if num in num_time.keys():
                num_time[num]+=time
            else:
                num_time[num]=time
            
    num_time = sorted(num_time.items())
    
    answer = []
    for i in num_time:
        cost = cost_counting(fees,i[1])
        answer.append(cost)
    
    return answer