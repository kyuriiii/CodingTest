def solution(lottos, win_nums):
    rank = [6,6,5,4,3,2,1]
    cnt = 0
    none = lottos.count(0)

    for i in lottos:
        for j in win_nums:
            if i == j:
                cnt += 1
    
    return [rank[cnt+none],rank[cnt]]

lottos = [44, 1, 0, 0, 31, 25]	
win_nums = [31, 10, 45, 1, 6, 19]
print( solution(lottos, win_nums ) )