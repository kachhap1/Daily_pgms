import java.util.*;
public class recur4 {
    public static void indices(int num[],int idx,int key)
    {
        if(idx == num.length)
        {
            return;
        }

        if(num[idx]== key) {
            System.out.println(idx+" ");
        }
        indices(num,idx+1,key);

    }

    public static void digiToString(String str[],int digit){
        if(digit == 0)return;

        int lastDig = digit %10;
        digiToString(str,digit/10);
        System.out.print(str[lastDig]+" ");
    }
    public static void main (String argsp[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int si= sc.nextInt();
        System.out.println("Enter Array of nums");
        int nums[] = new int [si];
        for(int i =0 ; i<si ;i++)
        {
            nums[i]= sc.nextInt();
        }
        System.out.println("Enter key to print the ocurrences in index");
        int key = sc.nextInt();
        System.out.println("Key found in : ");
        indices(nums,0,key);
        String[] digiStr={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.println("Enter the number");
        int digit= sc.nextInt();
        System.out.println("The String of digits is : ");
         digiToString(digiStr,digit);
    }
}
