package DynamicProgamming;
import java.util.*;

public class coinChange {

    static int min_coins(int [] coins, int amount){
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++)
            for(int c:coins)
                if(i>=c) dp[i]=Math.min(dp[i],dp[i-c]+1);
        return dp[amount]>amount?-1:dp[amount];

    }

    static int coin_combinations(int [] coins, int amount){
        int[] dp = new int [amount+1];
        dp[0] = 1;

        for(int c:coins){
            for(int i = 1; i <= amount; i++){
                if(c<=i) dp[i] += dp[i-c];
            }
        }
        return dp[amount];
    }
    public static void main(String agrs[]){
        int[] coins = {1,2,5};
        int n = 5;

        System.out.println(min_coins(coins, n));
        System.out.println(coin_combinations(coins,n));
    }
}
