class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> finalList = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol )
        {
            //top
            for(int j =startCol ;j<=endCol ; j++)
            {
                finalList.add(matrix[startRow][j]);
            }
            //right 
            for(int i = startRow +1 ; i <= endRow; i++)
            {
               finalList.add(matrix[i][endCol]);
            }
            //bottom
            for(int j = endCol-1 ;j>= startCol ; j--)
            {
                if(startRow == endRow)
                {
                    break;
                }
                finalList.add(matrix[endRow][j]);
            }
            //left
            for(int i = endRow -1 ; i>= startRow+1 ; i--){
                if(startCol == endCol){
                    break;
                }
                finalList.add(matrix[i][startCol]);
            }
            startRow++;
        endRow--;
        startCol++;
        endCol--;
        
        }
        
        return finalList;
    }
}
