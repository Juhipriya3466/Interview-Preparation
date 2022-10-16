class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        if(amount<1)
            return 0;
        Arrays.fill(dp,0);
        return ways(coins,amount,dp);
    }
    public int ways(int[] coins,int amount,int[] dp)
    {
        if(amount==0)
            return 0;
        if(amount<0)
            return -1;
        if(dp[amount]!=0)
            return dp[amount];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
          int res=ways(coins,amount-coins[i],dp);
          if(res>=0 && res<ans)
              ans=1+res;
        }
        dp[amount]=(ans==Integer.MAX_VALUE)?-1:ans;
        return dp[amount];
    }
}