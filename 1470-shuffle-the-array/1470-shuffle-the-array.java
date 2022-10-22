class Solution {
    public int[] shuffle(int[] nums, int n) {
        for(int i=0;i<nums.length;i++)
        {
            int currentpos=i;
            int currentnum=nums[i];
            while(currentnum>0)
            {
                int newpos=0;
                if(currentpos<n)
                    newpos=2*currentpos;
                else
                    newpos=2*(currentpos-n)+1;
                int newnum=nums[newpos];
                nums[newpos]=-currentnum;
                currentnum=newnum;
                currentpos=newpos;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
                nums[i]=-nums[i];
        }
        return nums;
    }
}