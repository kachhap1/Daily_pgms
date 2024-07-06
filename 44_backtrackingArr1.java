import java.util.*;
public class backtrack1 {

    public static  void changeArr(int[] arr, int i , int value){

        if(i == arr.length){
            display(arr);
            return;
        }
        arr[i]=value;
        changeArr(arr,i+1,value+1);
        arr[i]=value-2;
    }
    public static  void display(int[] arr){
        for(int i= 0;i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]= new int[6];
        changeArr(arr,0,1);
        display(arr);
    }
}
