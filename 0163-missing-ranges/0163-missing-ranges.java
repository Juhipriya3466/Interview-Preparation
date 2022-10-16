class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        ArrayList<String> res=new ArrayList<>();
        int prev=lower-1;
        for(int i=0;i<=nums.length;i++)
        {
            int current=(i<nums.length)?nums[i]:upper+1;
            if(prev+1<=current-1)
                res.add(formatrange(prev+1,current-1));
            prev=current;
        }
        return res;
    }
    public String formatrange(int lower,int upper)
    {
        if(lower==upper)
            return String.valueOf(lower);
        return lower+"->"+upper;
    }
}