package jishiT6;

import java.util.ArrayList;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入能量，以空格分隔：");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        ArrayList<Integer> energy = new ArrayList<>();
        for (String str: inputArray) {
            energy.add(Integer.parseInt(str));

        }
        System.out.println(maxEnergy(energy));

        scanner.close();
    }
    public static int maxEnergy(ArrayList<Integer> energys){
        int n = energys.size();
        if (n==0){
            return 0;
        }
        if (n==1){
            return energys.get(0);
        }
        if (n==2){
            return energys.get(0)*energys.get(1);
        }


    }
    public  static  int partSumCompare(ArrayList<Integer> energys,int n){
        int[] dp = new int[n];
        for (int j=1 ; j<n-1;j++) {
            dp[0]= energys.get(j-1)*energys.get(j)*energys.get(j+1);
            energys.set(j,1);

       //     dp[1]= Math.max(dp[0],energys.get(1)*energys.get(0)*energys.get(2));


            for (int i = 1; i<n ;i++ ){
                dp[i]=Math.max(dp[i-1]+energys.get(i),);
            }
            return dp[n-1];
        }

    }
}
