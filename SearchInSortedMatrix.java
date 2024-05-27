import java.util.*;
public class SearchInSortedMatrix
{
    public static boolean staircase(int matrix[][],int key)
    {
        int  row =0;
        int col = matrix[0].length-1 ;

        while(row< matrix.length && col >=0 )
        {
            if(key == matrix[row][col])
            {
                System.out.println("Found element at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col])
            {
                col--;
            }
            else if(key > matrix[row][col])
            {
                row++;
            }
            System.out.println("Key not Found");
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int matrix[][]  = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int key = 12;
        staircase(matrix,key);
    }
}
