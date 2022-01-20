count_selection = int(input())
check = list()
passed = list()
all = list()

def check_result(result):
    win = list()
    for i in range(len(passed)):
        for j in range(len(result)-1):
            if(result[j]["id"] == passed[i]):
                del result[j]
    for i in range(2,-1,-1):
        temp = result[0]["score"][i]
        win.append(result[0]["id"])
        for j in range(1,len(result)):
            if(result[j]["score"][i]==temp):
                win.append(result[j]["id"])
            elif(result[j]["score"][i]>temp):
                win.clear()
                temp = result[j]["score"][i]
                win.append(result[j]["id"])
        if(len(win)==1):
            passed.append(win[0])
            return
        else:
            win.clear()

for i in range(count_selection):
    result = list()
    count_participant, num_selection =  [int(x) for x in input().split()]
    check.append(input())
    for j  in range(count_participant):
        id_participant, level1_score, level2_score,level3_score = input().split()
        level1_score, level2_score,level3_score = int(level1_score), int(level2_score),int(level3_score)
        result.append({"id":id_participant, "score":[level1_score, level2_score, level3_score]})
    all.append(result)


for i in range(len(check)):
    check_result(all[i])
    if passed[i]==check[i]:
        print("YA")
    else:
        print("TIDAK")




        
