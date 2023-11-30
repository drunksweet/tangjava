while True:
    print('矩阵大小')
    a=int(input())
    if a==3:
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

    if a==2:
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
        sum=D[0][0]*D[1][1]-D[0][1]*D[1][0]
        print(sum)

    if a==4:
        D = [[0 for _ in range(a)] for _ in range(a)]
        print(D)
        sj=str(input())
        sj=sj.split(" ")
        print(sj)
        for i in range(a):
            for j in range(a):
                D[i][j]=int(sj[i*a+j])
        print(D)
        sum1=int(0)
        sum2=int(0)
        sum3=int(0)
        sum4=int(0)
        total_sum=int(0)

        D1 =[[0 for _ in range(a-1)] for _ in range(a-1)]

        for i in range(1,4):
            for j in range(1,4):
                D1[i-1][j-1]=D[i][j]
        print(D1)
        for i in range(a-1):
            x=int(1)
            for j in range(a-1):
                
                x*=D1[j][(j+i)%(a-1)]
            sum1=sum1+x

        for i in range(a-1-1,-1,-1):
            x=int(1)
            for j in range(a-1):
                
                x*=D1[j][(-j+i)%(a-1)]
            sum1-=x
        sum1*=D[0][0]

        
        D2 =[[0 for _ in range(a-1)] for _ in range(a-1)]

        for i in range(1):
            for j in range(1,4):
                D2[i][j-1]=D[i][j]
        for i in range(2,4):
            for j in range(1,4):
                D2[i-1][j-1]=D[i][j]
        print(D2)
        for i in range(a-1):
            x=int(1)
            for j in range(a-1):
                
                x*=D2[j][(j+i)%(a-1)]
            sum2=sum2+x


        for i in range(a-1-1,-1,-1):
            x=int(1)
            for j in range(a-1):
                
                x*=D2[j][(-j+i)%(a-1)]
            sum2-=x
        sum2*=D[1][0]
        
        D3 =[[0 for _ in range(a-1)] for _ in range(a-1)]
        for i in range(2):
            for j in range(1,4):
                D3[i][j-1]=D[i][j]
        for i in range(3,4):
            for j in range(1,4):
                D3[i-1][j-1]=D[i][j]
        print(D3)
        
        for i in range(a-1):
            x=int(1)
            for j in range(a-1):
                
                x*=D3[j][(j+i)%(a-1)]
            sum3=sum3+x
            
        for i in range(a-1-1,-1,-1):
            x=int(1)
            for j in range(a-1):
                x*=D3[j][(-j+i)%(a-1)]
            sum3-=x
        sum3*=D[2][0]
        
        D4 =[[0 for _ in range(a-1)] for _ in range(a-1)]

        for i in range(3):
            for j in range(1,4):
                D4[i][j-1]=D[i][j]
        print(D4)
        
        for i in range(a-1):
            x=int(1)
            for j in range(a-1):
                
                x*=D4[j][(j+i)%(a-1)]
            sum4=sum4+x
        for i in range(a-1-1,-1,-1):
            x=int(1)
            for j in range(a-1):   
                x*=D4[j][(-j+i)%(a-1)]
            sum4-=x
        sum4*=D[3][0]
        
        total_sum=sum1-sum2+sum3-sum4
        print(total_sum)

        
   ##x=D[0][i]*D[1][(i+1)%3]*D[2][(i+2)%3]
   
    
    
