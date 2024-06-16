import java.util.*;
public class div_conquer {

    public static void mergeSort(int[] arr, int left , int right){
        if(left >= right){
            return;
        }
        int mid = left+(right - left) /2;
        mergeSort(arr , left , mid);
        mergeSort(arr, mid+1 ,right );
        merge(arr, left , mid , right);
    }
    public static void merge(int arr[],int left , int mid , int right){
        int temp[] = new int[right - left +1]; //left(0,3)=4 , right(4,6)=3 --> 6-0+1=7
        int i = left;
        int j =mid+1;
        int k =0;
        while( i <= mid && j<=right){
            if(arr[i]<arr[j]){ //left < right
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<= mid){  //left part
            temp[k++] = arr[i++];
        }
        while (j<=right){ //right part
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k = 0,i = left;k<temp.length;k++,i++)
        {
            arr[i]= temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
