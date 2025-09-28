package Sorting_Searching_both;

import java.sql.SQLOutput;
import java.util.Arrays;

public class selection_sort {
    static int selection(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int min_idx = i;
            for(int j = i+1;j<n;j++){
                if(arr[min_idx]>arr[j]){
                    min_idx= j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx]= temp;
        }
        return 1;
    }
    public static void main(String[] args){
        int[] arr= {9,5,2,8,4};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));
        int sort = selection(arr);
        System.out.println("After sorting: ");


    }
}
