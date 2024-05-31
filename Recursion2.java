import java.util.*;
public class recur2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int si = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter arrays");
        for(int i =0;i< n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(checkAsc(arr,0));
        System.out.println("Enter Key to search 1st & last Occurence");
        int key = sc.nextInt();
        System.out.println(firstOccurence(arr,0,key));
        System.out.println(lastOccurence(arr,0,key));
        System .out.println("Enter x and n ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Power of x to n : "+power(x,n));
    }
    public static boolean checkAsc(int arr[],int i)
    {
        if(i== arr.length-1)
        {
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        return checkAsc(arr,i+1);
    }

    public static int firstOccurence(int arr[],int i,int key)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstOccurence(arr,i+1,key);
    }

    public static int lastOccurence(int arr[],int i,int key)
    {
        if(i==arr.length)
        {
            return -1;
        }
        int eleFound = lastOccurence(arr,i+1,key);
        if(arr[i]==key && eleFound == -1)
        {
            return eleFound;
        }

        return eleFound;
    }

    public static int power(int x , int n)
    {
        if(n == 0)
        {
            return  1;
        }
        int x1 = power(x,n-1);
        return  x* x1;
    }
}
