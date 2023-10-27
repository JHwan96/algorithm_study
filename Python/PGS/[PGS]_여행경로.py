def solution(tickets):
    answer = []

    routes = dict()
    s = ['ICN']
    
    for t in tickets:
        if t[0] in routes:
            routes[t[0]].append(t[1])
        else:
            routes[t[0]] = [t[1]]
    
    for depart in routes.keys():
        routes[depart] = sorted(routes[depart], reverse = True)

    while s:
        tmp = s[-1]

        if tmp in routes.keys() and len(routes[tmp]) != 0:
            port = routes[tmp].pop()
            s.append(port)
        else:
            answer.append(s.pop())
            
    n = len(answer)
    answer = [answer[-a-1] for a in range(n)]

    return answer