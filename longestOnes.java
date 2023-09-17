class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int maxcount=Integer.MIN_VALUE;
        int zero_count=0,j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zero_count++;
        
            }
            while(zero_count>k)
            {
                if(nums[j]==0)
                zero_count--;
                j++;
            }
                maxcount=Math.max(maxcount,i-j+1);
            }
        
        return maxcount;
    }
}
