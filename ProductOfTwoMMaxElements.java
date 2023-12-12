class Solution {
    public int maxProduct(int[] nums)
     {
          int s=nums.length;
          Arrays.sort(nums);
       
        int max=(nums[s-1]-1)*(nums[s-2]-1);
        return max;

    }
}
