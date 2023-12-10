class Solution {
    public int[] getConcatenation(int[] nums)
     {
         int s=nums.length;
         int[] resultArray= new int [2*s];
         for(int i=0;i<s;i++)
         {
             resultArray[i]=nums[i];
         }
         for(int i=0;i<s;i++)
         {
             resultArray[i+s]=nums[i];
         }
         return resultArray;
    }
}
