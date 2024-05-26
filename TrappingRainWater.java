import java.util.*;
public class TrappingRainWaterArray {
    public static int trappedRainwater(int height[] , int n )
    {
        //using auxillary or helper arrays

        //calcualte left max boundary
        int width =1;
        int[] leftMax = new int[n];
        leftMax[0]= height[0];
        for(int i = 1 ;i < n ;i++)
        {
            leftMax[i]= Math.max(leftMax[i-1], height[i-1]);
        }

        //calculate right max boundary
        int rightMax[]= new int[n];
        rightMax[n-1]=height[n-1];
        for(int i = n-2 ; i>=0;i--)
        {
            rightMax[i] = Math.max(rightMax[i+1] , height[i]);
        }

        int trappedWater=0;
        //loop for finding water level and trapped water
        for(int i =0 ;i< n ;i++)
        {
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel - height[i]  * width;
        }
        return trappedWater;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n");
        int  n =sc.nextInt();
        System.out.println("Enter "+n+" no. of heights");
        int height[]=new int[n];
        for(int i =0; i< n ; i++)
        {
            height[i]= sc.nextInt();
        }
        trappedRainwater(height, n);
    }
}
