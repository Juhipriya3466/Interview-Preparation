class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        int len=0;
        while(i<s.length() && j<s.length())
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                j++;
                len=Math.max(len,j-i);
            }
            else
            {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return len;
    }
}