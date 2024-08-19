class Solution {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // code here
        //two pointer 
        Arrays.sort(arr);
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==x)
            {
                return true;
            }
            else if(arr[i]+arr[j]<x)
            {
                i++;
            }
            else{
                j--;
            }
        }
        return false;
        // int n=arr.length;   //brute force
        // for(int i=0;i<n;i++)
        // {
        //     for(int j =i+1;j<n;j++)
        //     {
        //         if(arr[i]+arr[j]==x)
        //         {
        //             return true;
        //         }
                
        //     }
        // }
        // return false;
    }
}
