class Solution {
    public int firstUniqChar(String s) {
       /* HashMap<Character,Integer> map=new HashMap<>();
        int x=-1;
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            map.put(s.charAt(i),1);
            else
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
            {
                x=i;
                break;
            }      
        }
        return x; 
        =================================
        int ans=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
            {
                 ans=i;
                break;
            }
        }
        return ans;
        */
        int[] ans=new int[26];
        int res=-1;
        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i)-'a';
            ans[ch]+=1;
        }
        for(int i=0;i<s.length();i++)
        {
                if(ans[s.charAt(i)-'a']==1)
                {
                    res=i;
                    break;
                }
                
        }
        return res;
    }
}