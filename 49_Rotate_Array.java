class Solution {
    public void rotate(int[] nums, int k) {
        int temp[] = new int[k];
        k=k%nums.length;
        //copy  last k elements to temp
        for(int i =0;i<k;i++)
        {
            temp[i]= nums[nums.length-k+i];
        }
        //shift remainig elements by k position
         for (int i = nums.length-k-1; i>=0; i--) 
         {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i <k; i++) 
        {
            nums[i] = temp[i];
        }
        
    }
}
