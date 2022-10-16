class Solution {
    public int findPeakElement(int[] nums) {
        //Binary Search
        int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid+1])
                high=mid;
            else
                low=mid+1;
        }
        return low;
        //Linear search
        /*
        if(nums.length==1 || nums[0]>nums[1])
            return 0;
        if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
                return i;
        }
        return -1;*/
    }
}