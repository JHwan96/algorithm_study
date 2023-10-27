def solution(record):
    answer = []
    uid_uname = {}
    id_check = {}
    count = 1
    
    for sen in record:
        token = sen.split(' ')
        if len(token) == 3:
            comm, uid, name = token
        else:
            comm, uid = token
            
        if comm == 'Enter':
            if len(uid) <= 10 and len(uid) >= 1 and len(name) <= 10 and len(name) >= 1:
                uid_uname[f'{count}']=f'{uid}'
                answer.append('님이 들어왔습니다.')
                id_check[f'{uid}'] = f'{name}'
                count+=1
            else:
                break
        
        elif comm == 'Leave':
            if len(uid) <= 10 and len(uid) >= 1:
                uid_uname[f'{count}'] = f'{uid}'
                answer.append('님이 나갔습니다.')
                count+=1
            else:
                break
        elif comm == 'Change':
            if len(uid) <= 10 and len(uid) >= 1 and len(name) <= 10 and len(name) >= 1:
                id_check[f'{uid}'] = f'{name}'
            else:
                break
        else:
            break

    for i in range(len(uid_uname)):
        uname = id_check[uid_uname[f'{i+1}']]
        answer[i]= uname+answer[i]
    return answer