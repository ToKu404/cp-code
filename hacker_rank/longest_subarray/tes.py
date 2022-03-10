r = int(input())
c = int(input())


arr = []
for i in range(r):
    inp = input()
    col = [int(x) for x in inp.split(" ")]
    arr.append(col)
    
dominant = 0
for i in range(r):
    for j in range(c):
        value = arr[i][j]
        temp = 1
        for k in range(max(0, i-1), min(len(arr), i+2)):
            for l in range(max(0, j-1), min(len(arr[0]),j+2)):
                if((k,l)!=(i,j) and value<=arr[k][l]):
                    temp = 0
                    break
            if(temp==0):
                break
        else:
            dominant+=1

print(dominant)