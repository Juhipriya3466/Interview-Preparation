class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length)
            return nums;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else
                map.put(nums[i],map.get(nums[i])+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((n1,n2)->map.get(n1)-map.get(n2));
        for(int x:map.keySet())
        {
            pq.add(x);
            if(pq.size()>k)
                pq.poll();
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++)
            res[i]=pq.poll();
        return res;
    }
}