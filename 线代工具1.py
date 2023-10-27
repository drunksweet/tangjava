while True:
   ## print('矩阵大小')
    a=int(3)
    D = [[0 for _ in range(a)] for _ in range(a)]
    print(D)
    sj=str(input())
    sj=sj.split(" ")
    print(sj)
    for i in range(a):
        for j in range(a):
            D[i][j]=int(sj[i*a+j])
    print(D)
    sum=int(0)

    for i in range(a):
        x=int(1)
        for j in range(a):
            
            x*=D[j][(j+i)%a]
        sum=sum+x
        #print(sum)

    for i in range(a-1,-1,-1):
        x=int(1)
        for j in range(a):
            
            x*=D[j][(-j+i)%a]
        sum-=x
        #print(sum)
    print(sum)

                
        
   ##x=D[0][i]*D[1][(i+1)%3]*D[2][(i+2)%3]
   
    
    
