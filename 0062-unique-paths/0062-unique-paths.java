class Solution {
    public int uniquePaths(int m, int n) {
        if((m==0 && n==0)||(m==1 && n==1))
            return 1;
        int[][] dp=new int[m][n];
        for(int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],-1);
        return ways(0,0,m,n,dp);
    }
    public int ways(int i,int j,int m,int n,int[][] dp)
    {
        if(i>m-1 || i<0 || j<0 || j>n-1)
            return 0;
        if(i==m-1 && j==n-1)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=0;
        ans=ways(i+1,j,m,n,dp)+ways(i,j+1,m,n,dp);
        dp[i][j]=ans;
        return ans;
    }
}