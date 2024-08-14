import java.util.*;
public class NextGreaterElement {

    public static void nextGreater(int[] arr)
    {
        int n= arr.length;
        int next[]=new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<= arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                next[i]=-1;
            }
            else{
                next[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for(int i =0;i<next.length;i++)
        {
            System.out.print(next[i]+" " );
        }
    }
    public static  void main(String args[])
    {
        int arr[] = {6,8,0,1,3};
        nextGreater(arr);
    }
}
