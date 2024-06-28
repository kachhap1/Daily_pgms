import java.util.*;
public class recur6 {
    public static int binarySearch(int arr[],int si,int target, int ei)
    {
        if(si>ei)
        {
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(target==arr[mid])
        {
            return mid;
        } else if (target < arr[mid]) {
           return binarySearch(arr,si,target,mid-1);
        }
        else {
           return binarySearch(arr,mid+1,target,ei);
        }

    }
    public static void main(String arrgs[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,5,6,7,8,9};
        System.out.println("Enter target to search");
        int target = sc.nextInt();
        System.out.println(binarySearch(arr,1,target,arr.length-1));
    }
}
