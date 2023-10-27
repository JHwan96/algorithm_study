N, M = map(int, input().split())
poke_list = dict()
poke = dict()
for i in range(1,N+1):
    poke_list[str(i)] = input();

tmp_poke = poke_list.copy()
for k,v in tmp_poke.items():
    poke_list[v] = k
    
for i in range(M):
    x = input()
    print(poke_list[x])