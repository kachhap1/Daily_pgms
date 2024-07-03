import java.util.*;
public class mergeSort {
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        merSort(arr,0,arr.length-1);
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void merSort(int arr[],int si,int ei){
        if(si>=ei)
        {
            return;
        }
        int mid = si+(ei-si)/2;
        merSort(arr,si,mid);
        merSort(arr,mid+1,ei);
        merging(arr,si,mid,ei);
    }
    public static void merging(int arr[], int si , int mid , int ei){
        int tempArr[] = new int[ei-si+1];
        int i = si; //for left part
        int j = mid+1; //for right part
        int k =0; //for temp array
        while(i <= mid && j<= ei )
        {
            if(arr[i]<arr[j]) {
                tempArr[k] = arr[i];
                i++;
            }
            else{
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<=mid)
        {
            tempArr[k++] = arr[i++];
        }

        while (j<=ei)
        {
            tempArr[k++] = arr[j++];
        }

        for(k = 0, i=si; k< tempArr.length;k++,i++){
            arr[i] = tempArr[k];
        }
    }

}
