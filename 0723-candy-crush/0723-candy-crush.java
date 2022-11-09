class Solution {
    public int[][] candyCrush(int[][] board) {
        boolean flag=false;
        int rows=board.length;
        int cols=board[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j+2<cols;j++)
            {
                int v=Math.abs(board[i][j]);
                if(v!=0 && v==Math.abs(board[i][j+1]) && v==Math.abs(board[i][j+2]))
                {
                   flag=true;
                   board[i][j]=board[i][j+1]=board[i][j+2]=-v;
                }
            }
        }
            
        for(int i=0;i+2<rows;i++)
        {
              for(int j=0;j<cols;j++)
              {
                  int v=Math.abs(board[i][j]);
                  if(v!=0 && v==Math.abs(board[i+1][j]) && v==Math.abs(board[i+2][j]))
                  {
                   flag=true;
                   board[i][j]=board[i+1][j]=board[i+2][j]=-v;
                  }
               }
            
           }
        for(int i=0;i<cols;i++)
        {
            int row=rows-1;
            for(int j=rows-1;j>=0;j--)
            {
                if(board[j][i]>0)
                {
                    board[row][i]=board[j][i];
                    row--;
                }
            }
            while(row>=0)
            {
                board[row][i]=0;
                row--;
            }
        }
        return flag?candyCrush(board):board;
        
    }
}