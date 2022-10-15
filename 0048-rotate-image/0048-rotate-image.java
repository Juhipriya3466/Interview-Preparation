class Solution {
    public void rotate(int[][] matrix) {
        //Rotate=Transpose+Reverse
        //Transpose
        int temp,i,j;
        for(i=0;i<matrix.length;i++)
        {
            for(j=i;j<matrix[0].length;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       //Reverse
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<(matrix.length/2);j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1]=temp;
            }
        }
    }
}