package jishiT3;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字1--20，我将算出其的阶乘和");
        int a= sc.nextInt();
        int sum =0;
        for (int i = 1; i < a+1; i++) {
            sum+=digui(i);

        }
        System.out.println("结果为："+sum);

    }

    public static int digui(int n){
        int partSum= n;
        if(n!=1){
            partSum*=digui(n-1);
        }
       // for (int i = 1; i < n; i++) {
        //    partSum*=i;
       // }

    return  partSum;
    }
}
