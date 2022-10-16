class Solution {
    public String longestPalindrome(String s) {
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],-1);
        String res="";
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalindrome(i,j,s,dp)==1)
                {
                    if(len<j-i+1)
                    {
                        len=j-i+1;
                        res=s.substring(i,i+len);
                    }
                }
            }
        }
        return res;
    }
    
    public int isPalindrome(int i,int j,String s,int[][] dp)
    {
        if(i>=j)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=((s.charAt(i)==s.charAt(j))?1:0) & isPalindrome(i+1,j-1,s,dp);
        dp[i][j]=ans;
        return ans;
    }
}