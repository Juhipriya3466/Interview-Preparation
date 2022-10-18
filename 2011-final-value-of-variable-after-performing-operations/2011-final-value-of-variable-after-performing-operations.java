class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(int i=0;i<operations.length;i++)
        {
            char str=operations[i].charAt(1);
            if(str=='+')
                X=X+1;
            else
                X=X-1;
        }
        return X;
    }
}