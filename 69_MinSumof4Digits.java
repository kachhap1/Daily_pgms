class Solution {
    public int minimumSum(int num)
    {
        String s1=Integer.toString(num);
        int[] arr= new int[s1.length()];
        
        for(int i=0;i<s1.length();i++)
        {
            arr[i]=s1.charAt(i)-'0';
        }
        //sort
        for(int i =0;i<arr.length;i++)
        {
          for(int j=0;j<arr.length-1-i;j++)  
          {
              if(arr[j]>arr[j+1])
              {
                  //swap
                  int temp = arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
          }
        }
        int num1 = arr[0]*10+arr[1]*10;
        int num2 = arr[2]+arr[3];
        return num1+num2;
        
    }
}
