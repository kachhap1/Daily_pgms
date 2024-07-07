import java.util.*;
public class backtrack2 {
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
       subsets(str,0,sets);
    }
}
