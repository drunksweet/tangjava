package jishiT5;

import java.security.KeyStore;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        zuzhi();


    }
    public  static  void zuzhi(){
        System.out.println("输入有多少空间");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("输入第"+(i+1)+"的高度");
            height[i]=sc.nextInt();

        }
        boolean flag=false;
        int L=0;
        int Lindex=0;
        int R=0;
        int Rindex=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            if(height[i]!=0 && flag==false){
                L=height[i];
                Lindex=i;
                flag=true;
                continue;
        }
            if(height[i]!=0 && flag==true){
                R=height[i];
                Rindex=i;
                flag=false;
                sum+=Math.min(L,R)*(Rindex-Lindex-1);
                continue;
            }


        }
        System.out.println(sum);
    }
}
