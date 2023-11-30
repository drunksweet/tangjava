##求解 （a*b型） * （b*c型）矩阵乘法
while True:
    print('两个矩阵大小 a*b b*c')
    print('a')
    a=int(input())
    print('b')
    b=int(input())
    print('c')
    c=int(input())
    ##
    D1 = [[0 for _ in range(b)] for _ in range(a)]
    D2 = [[0 for _ in range(c)] for _ in range(b)]
    print(D1)
    print(D2)
    ##
    print("输入第一个矩阵元素")
    sj1=str(input())
    sj1=sj1.split(" ")
    print(sj1)
    for i in range(a):
        for j in range(b):
            D1[i][j]=int(sj1[i*b+j])
    print(D1)
    print("输入第二个矩阵元素")
    sj2=str(input())
    sj2=sj2.split(" ")
    print(sj2)
    for i in range(b):
        for j in range(c):
            D2[i][j]=int(sj2[i*c+j])
    print(D2)
    ##
    D= [[0 for _ in range(c)] for _ in range(a)]
    print(D)
    sum=int(0)
    for i in range(a):
        for j in range(c):
            sum=int(0)
            for x in range(b):
                sum+=D1[i][x]*D2[x][j]
            D[i][j]=sum
    print(D)
                
            
            
