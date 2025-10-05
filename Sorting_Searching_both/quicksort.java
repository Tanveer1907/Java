package Sorting_Searching_both;

import java.util.Arrays;

public class quicksort {
    //quicksort
    public static void quick_sort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quick_sort(arr,low,pi-1);
            quick_sort(arr,pi+1,high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]= arr[high];
        arr[high]= temp;
        return i;
    }
    public static void main(String[] args){
        int[] arr ={10,7,9,1,8,5};
        quick_sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

