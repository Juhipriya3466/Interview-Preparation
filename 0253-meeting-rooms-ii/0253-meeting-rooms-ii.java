class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length==0)
            return 0;
     Integer[] start=new Integer[intervals.length];
        Integer[] end=new Integer[intervals.length];
        for(int i=0;i<intervals.length;i++)
        {
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
        }
        Arrays.sort(start,new Comparator<Integer>() {
          public int compare(Integer a, Integer b) {
            return a - b;
          }
        });
        Arrays.sort(
        end,
        new Comparator<Integer>() {
          public int compare(Integer a, Integer b) {
            return a - b;
          }
        });
        int low=0;
        int high=0;
        int count=0;
        while(low<intervals.length)
        {
            if(start[low]>=end[high])
            {
                count-=1;
                high+=1;
            }
            
                count+=1;
                low+=1;     
        }
        return count;
    }
}