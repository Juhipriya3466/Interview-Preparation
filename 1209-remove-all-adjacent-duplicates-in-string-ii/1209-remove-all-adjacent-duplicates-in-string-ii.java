class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Integer> count=new Stack<>();
        int j=0;
        char[] sa=s.toCharArray();
        for(int i=0;i<s.length();++i,++j)
        {
            sa[j]=sa[i];
            if(j==0 || sa[j]!=sa[j-1])
                count.push(1);
            else
            {
                int cnt=count.pop()+1;
                if(cnt==k)
                {
                    j=j-k;
                }
                else
                count.push(cnt);
            }
        }
        return new String(sa,0,j);
    }
}