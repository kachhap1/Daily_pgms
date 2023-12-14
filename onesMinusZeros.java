class Solution {
    public int[][] onesMinusZeros(int[][] grid) 
    {
        int row=grid.length;
        int col=grid[0].length;
        int[] onesrow=new int[row];
        int[] onescol=new int[col];
        int[] zerorow=new int[row];
        int[] zerocol=new int[col];
        int[][] diff=new int [row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                {
                 onesrow[i]++;
                onescol[j]++;   
                }
                
                if(grid[i][j]==0)
                {
                  zerorow[i]++;
                zerocol[j]++;  
                }
                
            }
            
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                diff[i][j]=onesrow[i]+onescol[j]-zerorow[i]-zerocol[j];
            }
        }
        
        return diff;
    }
}
