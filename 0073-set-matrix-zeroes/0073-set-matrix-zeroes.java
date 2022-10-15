class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isCol=false;
        // Check if there is "0" in 1st column of each row
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]==0)
                isCol=true;
        }
        //Iterate over the matrix and if a "0" is encountered,mark 1st row and 1st col as 0
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        //Iterate and check and make complete row and column as 0 
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }
        //Check if 1st row needs to be marked as 0
        if(matrix[0][0]==0)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                matrix[0][j]=0;
            }
        }
        // Check is 1st col needs to be marked as 0
        if(isCol==true)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][0]=0;
            }
        }
    }
}