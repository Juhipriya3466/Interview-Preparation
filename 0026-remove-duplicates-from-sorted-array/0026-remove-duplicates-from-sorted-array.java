class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1)
            return 1;
        if(nums.length==2)
        {
            if(nums[0]==nums[1])
                return 1;
            else return 2;
        }
        int i=0;
        int j=1;
        while(j<nums.length)
        {
            if(nums[i]==nums[j])
                j++;
            else
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}