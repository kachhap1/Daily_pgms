
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int max=arr[0];
        int secondMax=-1;
        //finding 2nd max without sorting
        for(int i = 0;i<n;i++)
        {
            
                max = Math.max(max,arr[i]);
        }
        for(int i = 0 ;i<n;i++){
              if(arr[i]> secondMax && arr[i]!= max)
            {
                secondMax = arr[i];
                
            }

        }
        
            return secondMax;
    }
}
