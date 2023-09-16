class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder st= new StringBuilder();
        int size1=word1.length();
        int size2=word2.length();
        int size=size1+size2;
        for(int i=0;i<size;i++)
        {
            if(i<size1)
            {
                st.append(word1.charAt(i));
            }
            if(i<size2)
            {
                st.append(word2.charAt(i));
            }
        }
        return st.toString();
        
    }
}
