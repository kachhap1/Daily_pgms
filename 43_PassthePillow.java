class Solution {
    public int passThePillow(int n, int time) {
        int count =1;
        boolean revDir = false;
        int currtime = 0;
        while(currtime<time)
        {
            if(!revDir)
            {
                count++;
            }
            else{
                count--;
            }
            if(count==1 || count==n)
            {
                revDir =!revDir;
            }
            currtime++;
        }
        return count;
    }
}
