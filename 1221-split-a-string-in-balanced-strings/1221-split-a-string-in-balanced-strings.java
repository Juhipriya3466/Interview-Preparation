class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int balancechecker=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='L')
                balancechecker++;
            else
                balancechecker--;
            if(balancechecker==0)
                ans++;
        }
        return ans;
    }
}