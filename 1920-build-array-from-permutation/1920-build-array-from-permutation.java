class Solution {
    public int[] buildArray(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            int b=nums[nums[i]];
            nums[i]=(a+nums.length*(b%nums.length));
        }
        for(int i=0;i<nums.length;i++)
        {
           nums[i]=nums[i]/nums.length;
        }
        return nums;
    }
}