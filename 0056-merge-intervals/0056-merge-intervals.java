class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        Arrays.sort(intervals,(i1,i2)->Integer.compare(i1[0],i2[0]));
        ArrayList<int[]> res=new ArrayList<>();
        int[] prev=intervals[0];
        res.add(prev);
        for(int[] current:intervals)
        {
            if(current[0]<=prev[1])
                prev[1]=Math.max(prev[1],current[1]);
            else
            {
                prev=current;
                res.add(prev);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}