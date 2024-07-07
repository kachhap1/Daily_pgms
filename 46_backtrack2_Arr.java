import java.util.*;
public class backtrack2 {
    public static void permutation(String str, String ans)
    {
        String new_s="";
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char currChar;
        for(int i = 0 ;i<str.length();i++)
        {
            currChar = str.charAt(i);
            new_s = str.substring(0,i) + str.substring(i+1);
            permutation(new_s,ans+currChar);
        }
    }
    public static void subsets(String str , int i , String sets)
    {
        if(i>=str.length()){
            if(sets.length() == 0)
            {
                System.out.println("null");
            }else {
                System.out.println(sets);
            }
            return;
        }
        //for_yes
        subsets(str,i+1,sets+str.charAt(i));
        //for_no
        subsets(str,i+1,sets);
    }

    public static void main(String args[]){
        String str = "abs";
        String sets="";
     //  subsets(str,0,sets);
       permutation(str,"");
    }
}
