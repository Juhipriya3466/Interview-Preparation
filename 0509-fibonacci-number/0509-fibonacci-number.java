class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            if(i==0 || i==1)
                dp[i]=i;
            else
                dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}