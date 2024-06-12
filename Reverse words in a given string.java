class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        
        String str[] = S.split("\\.");
        StringBuilder finalstr = new StringBuilder();
        for(int i =  str.length-1;i>=0;i--)
        {
            finalstr.append(str[i]);
            if(i!=0)
            {
                finalstr.append(".");
            }
        }
        return finalstr.toString();
    }
}
