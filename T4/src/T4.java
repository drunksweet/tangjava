
import java.util.ArrayList;
import java.util.Scanner;

public class T4 {
    public static int maxBenefit(ArrayList<Integer> moneys){
          int n = moneys.size();
          if (n==0){
              return 0;
          }
          if (n==1){
              return moneys.get(0);
          }
          if (n==2){
              return Math.max(moneys.get(0),moneys.get(1));
          }
          int[] dp = new int[n];
          dp[0]= moneys.get(0);
          dp[1]= Math.max(dp[0],moneys.get(1));

          for (int i = 2; i<n ;i++ ){
              dp[i]=Math.max(dp[i-2]+moneys.get(i),dp[i-1]);
          }
          return dp[n-1];
    }

    public static void main(String[] args) {

    }
}

