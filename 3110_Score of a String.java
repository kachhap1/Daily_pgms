class Solution {
    public int scoreOfString(String s) 
    {
        char c;
        int chValue[] = new int[s.length()];
        int sum=0;
        for(int i = 0;i<s.length()-1;i++)
        {
            int currVal = (int) s.charAt(i);
            int nextVal = (int) s.charAt(i+1);
            sum +=Math.abs(currVal - nextVal);
        }
        return Math.abs(sum);
        
    }
}
