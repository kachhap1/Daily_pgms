class Solution {
    public int mostWordsFound(String[] sentences) 
    {
       // String word = "";
        int length;
        int maxlen =0 ;
//         for(int i = 0;i<sentences.length ;i++)
//         {
//             length = 1;
           
//            word = sentences[i];
//             for(int j= 0 ; j< word.length() ;j++)
//             {
//                 if(word.charAt(j) == ' ')
//                 {length++;}
//            }
//             maxlen = Math.max(length, maxlen);
        // }
        
for(String s : sentences)
{ 
    String[] word = s.split(" ");
   length = word.length;
    if(length> maxlen)
    {
        maxlen=length;
    }
}
        return maxlen;
    }
}
