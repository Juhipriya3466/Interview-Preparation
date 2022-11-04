class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        int j=ruleKey.equals("color")?1:ruleKey.equals("type")?0:2;
           for(int i=0;i<items.size();i++)
            {
                if(ruleValue.equals(items.get(i).get(j)))
                    ans++;
            }
        return ans;
    }
}