public static void main(String args[])
    {
int nums[] = {1,2,3,4,5,6,7};
        int temp = nums[nums.length-1];
        for(int i = nums.length-1;i>0 ;i--)
        {
            nums[i] = nums[i-1];
        }
        nums[0] = temp;
        for(int e  : nums)
        {
            System.out.print(e+" ");
        }
}
