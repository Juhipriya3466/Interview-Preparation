class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        if(ruleKey.equals("color"))
        {
            for(int i=0;i<items.size();i++)
            {
                if(ruleValue.equals(items.get(i).get(1)))
                    ans++;
            }
        }
        else if(ruleKey.equals("type"))
        {
            for(int i=0;i<items.size();i++)
            {
                if(ruleValue.equals(items.get(i).get(0)))
                    ans++;
            }
        }
        else
        {
            for(int i=0;i<items.size();i++)
            {
                if(ruleValue.equals(items.get(i).get(2)))
                    ans++;
            }
        }
        return ans;
    }
}