import java.util.*;

public class StackreverseString {

    public static String reverseString(String str)
    {
        Stack<Character> s = new Stack<>();
        int index=0;
        while(index < str.length())
        {
            char curr=str.charAt(index);
            s.push(curr);
            index++;
        }
        StringBuilder res = new StringBuilder();
        while(!s.isEmpty())
        {
           char temp = s.pop();
           res.append(temp);

        }
        return res.toString();
    }

    public static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String result = reverseString(str);
        System.out.println(result);
    }
}
