class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<String>();
     for(int i=0;i<9;i++)
     {
         for(int j=0;j<9;j++)
         {
             char c=board[i][j];
             if(c!='.')
             {
                 if(!set.add(c+"found in"+i+"row") || !set.add(c+"found in"+j+"column") || !set.add(c+"found in"+i/3+j/3+"box"))
                     return false;
             }
         }
     }
        return true;
    }
}