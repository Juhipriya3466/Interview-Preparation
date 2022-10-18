class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
     if(image[sr][sc]==color)
         return image;
        fill(image,sr,sc,image[sr][sc],color);
        return image;
    }
    public void fill(int[][] image,int sr,int sc,int color,int newcolor)
    {
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=color)
            return;
        image[sr][sc]=newcolor;
        fill(image,sr+1,sc,color,newcolor);
        fill(image,sr,sc+1,color,newcolor);
        fill(image,sr-1,sc,color,newcolor);
        fill(image,sr,sc-1,color,newcolor);
    }
}