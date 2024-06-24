class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]= new int[n][n];
        int startRow = 0;
        int endRow=n-1;
        int startCol= 0;
        int endCol = n-1;
        int element = 1;
        while(element <= n*n)
        {
            //top 
            for(int i=startCol ; i<=endCol ;i++)
            {
                matrix[startRow][i] = element;
                element ++;
            }
            //right
            for(int j= startRow+1 ; j<=endRow ;j++)
            {
                matrix[j][endCol] = element;
                element++;
            }
            //bottom
            for(int i= endCol -1 ;i>= startCol ; i--)
            {
                if(startRow == endRow)
                {
                    break;
                }
                matrix[endRow][i] = element;
                element++;
            }
            //left
            for(int j = endRow-1;j>=startRow+1;j--)
            {
                if(startCol==endCol ) break;
                matrix[j][startCol] = element;
                element++;
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
            
        }
        return matrix;
        
    }
}
