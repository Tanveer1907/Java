package Array_Practice;

import java.util.*;

public class arrays_st2 {
    public static void main(String[] args){
        //1. insertion of element
//         int[] arr = {1,2,3,4,5};
//         int element = 6;
//         int pos = 3;
//         int n = arr.length;
//         int[] new_arr = new int[n+1];
//         for(int i = 0;i<pos;i++){
//             new_arr[i]= arr[i];
//         }
//         new_arr[pos]= element;
//         for(int i = n;i>pos;i--){
//             new_arr[i] = arr[i-1];
//         }
//        System.out.print(Arrays.toString(new_arr));

        //2. deletion
//        int[] arr = {1,2,3,4,5};
//        int pos = 2;
//        for(int i = pos;i<arr.length-1;i++){
//            arr[i]= arr[i+1];
//        }
//        arr[arr.length-1]= 0;
//        System.out.print(Arrays.toString(arr));

        //3. second-smallest event
//        int[] arr = {1,2,3,4,5};
//        int lowest = Integer.MAX_VALUE, second_lowest = Integer.MAX_VALUE;
//        for(int i = 0;i<arr.length; i++){
//            if(arr[i]<lowest){
//                second_lowest = lowest;
//                lowest = arr[i];
//            }
//            else if(arr[i]!=lowest && arr[i]<second_lowest) {
//                second_lowest = arr[i];
//            }
//        }
//        System.out.print(second_lowest);

        //check is array is sorted in ascending order
//        int[] arr = {1,2,3,5,4};
//        boolean sorted = true;// sorted in ascending order;
//        for(int i = 0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                sorted = false;
//                break;
//            }
//        }
//        System.out.println(sorted);

        //find index of first occurrence of a value
        int[] arr ={1,2,3,4,5};
        int element = 4;
        int index =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == element){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
