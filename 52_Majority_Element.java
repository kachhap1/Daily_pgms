// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         return nums[n/2];
//     }
// }
class Solution{
    public int majorityElement(int[] nums)
    {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int n : nums)
        {
            freq.put(n,freq.getOrDefault(n,0)+1);
            
        }
        int s = nums.length/2;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet())
        {
            if(entry.getValue()>s)
                return entry.getKey();
        }
        return 0;
    }
}
