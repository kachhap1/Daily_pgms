class Solution {
    public int balancedStringSplit(String s) 
    {
        int countL =0;
        int countR = 0;
        int maxCount=0;
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='L')
               { countL++;}
            else if(s.charAt(i)=='R')
                {countR++;}
            if(countL==countR)
            {
                maxCount++;
                countL=0;
                countR=0;
            }
        }
        return maxCount;
        
    }
}
