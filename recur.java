import java.util.*;
public class recur3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and n");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(optimizedPower(x,n));
        System.out.println("Enter the width of board to set tiles ");
        int width = sc.nextInt();
        System.out.println("No. of ways to tile :"+tiling(width));

    }
    public  static int optimizedPower(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        int halfpower  = optimizedPower(x,n/2) * optimizedPower(x,n/2);
        if(n%2 != 0)
        {
            halfpower =  x * halfpower;
        }
            return halfpower;

    }

    //Tiling Problem
    public static int tiling(int n)
    {
        if(n== 0 || n== 1)
        {
            return 1;
        }
        int verti = tiling(n-1);
        int horiz = tiling(n-2);
        return verti+horiz;
    }
}
