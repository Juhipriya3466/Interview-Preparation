class Solution {
    public boolean isAnagram(String s, String t) {
        int[] frequency=new int[26];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
            frequency[s.charAt(i)-'a']+=1;
        for(int i=0;i<t.length();i++)
        {
            if(frequency[t.charAt(i)-'a']==0)
                return false;
            else
                frequency[t.charAt(i)-'a']-=1;
        }
        return true;
        
        // Follow up answer : Use hash table instead of frequency couter array
    }
}