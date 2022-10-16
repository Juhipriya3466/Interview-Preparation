class Solution {
    public int[] searchRange(int[] nums, int target) {
     if(nums.length==0)
         return new int[]{-1,-1};
        int low=0;
        int high=nums.length-1;
        int[] res=new int[2];
        Arrays.fill(res,-1);
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]<target)
                low=mid+1;
            else if(nums[mid]>target)
                high=mid-1;
            else
            {
                low=mid-1;
                high=mid+1;
                while(low>=0 && nums[low]==target)
                    low--;
                while(high<nums.length && nums[high]==target)
                    high++;
                res[0]=low+1;
                res[1]=high-1;
                break;
            }
        }
        return res;
    }
}