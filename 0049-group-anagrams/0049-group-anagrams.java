class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0)
            return new ArrayList();
        HashMap<String,List> map=new HashMap<String,List>();
        int[] count=new int[26];
        for(int i=0;i<strs.length;i++)
        {
            Arrays.fill(count,0);
            for(int j=0;j<strs[i].length();j++)
            {
                count[strs[i].charAt(j)-'a']++;
            }
            StringBuilder sb=new StringBuilder("");
            for(int j=0;j<26;j++)
            {
                sb.append("#");
                sb.append(count[j]);
            }
            String key=sb.toString();
            if(!map.containsKey(key))
                map.put(key,new ArrayList());
            map.get(key).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}